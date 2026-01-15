package Java_Daily.Day04_Bitwise_Operators;

public class operator4 {
    public static void main(String[] args) {
        // 1. Defining permission using powers of 2
        int READ    = 1;  // Binary: 0001
        int WRITE   = 2;  // Binary: 0010
        int EXECUTE = 4;  // Binary: 0100
        int DELETE  = 8;  // Binary: 1000

        // 2. Initializing a user with ZERO permissions
        int userPermissions = 0; // Binary: 0000

        // 3. Adding READ and WRITE permissions using OR
        // OR "turns on" the bits if they aren't already on.
        userPermissions = userPermissions | READ | WRITE;

        System.out.println("User Permissions (Decimal): " + userPermissions);
        System.out.println("User Permissions (Binary):  " + Integer.toBinaryString(userPermissions));

        // 4. Checking if user has WRITE permission using AND
        // If (result & WRITE) is non-zero, the bit is "on".
        boolean canWrite = (userPermissions & WRITE) != 0;
        System.out.println("Can user write? " + canWrite);

        // 5. Checking if user has DELETE permission
        boolean canDelete = (userPermissions & DELETE) != 0;
        System.out.println("Can user delete? " + canDelete);

        // 6. Removing WRITE permission using XOR 
        // XOR "toggles" the bit (if it's 1, it becomes 0).
        userPermissions = userPermissions ^ WRITE;
        
        System.out.println("After removing WRITE (Binary): " + Integer.toBinaryString(userPermissions));
    }
    
}

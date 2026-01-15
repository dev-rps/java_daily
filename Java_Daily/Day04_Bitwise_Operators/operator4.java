package Java_Daily.Day04_Bitwise_Operators;

public class operator4 {
    public static void main(String[] args) {
        // 1. SETTING THE STAGE (Powers of 2)
        // Each number represents a unique "bit" position.
        int READ    = 1;  // 0001
        int WRITE   = 2;  // 0010
        int EXECUTE = 4;  // 0100
        int DELETE  = 8;  // 1000

        // 2. CREATING A USER (Initially has no access)
        int userPermissions = 0; // 0000

        // 3. GRANTING ACCESS (The OR | Operator)
        // We stamp the READ and WRITE bits onto the user.
        userPermissions = userPermissions | READ | WRITE; 
        
        System.out.println("Current Binary: " + Integer.toBinaryString(userPermissions)); // 0011

        // 4. THE SECURITY CHECK (The AND & Operator)
        // This is how print human readable words based on bits.
        
        System.out.println("\n--- Security Clearance Check ---");
        
        // Check for READ
        if ((userPermissions & READ) != 0) {
            System.out.println("✅ Access Granted: You can read this file.");
        } else {
            System.out.println("❌ Access Denied: Read permission required.");
        }

        // Check for DELETE
        if ((userPermissions & DELETE) != 0) {
            System.out.println("✅ Access Granted: You can delete this file.");
        } else {
            System.out.println("❌ Access Denied: You do not have Delete authority.");
        }

        // 5. REVOKING ACCESS (The XOR Operator)
        // Lets toggle the WRITE permission off.
        System.out.println("\n[System Update: Revoking Write Access...]");
        userPermissions = userPermissions ^ WRITE; 

        // 6. FINAL STATUS
        boolean canWriteNow = (userPermissions & WRITE) != 0;
        System.out.println("Can the user write now? " + (canWriteNow ? "Yes" : "No"));
        System.out.println("Final Binary State: " + Integer.toBinaryString(userPermissions));
    }
    
}

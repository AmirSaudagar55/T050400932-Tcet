// Step 1: We start by printing the original array of crates.
// Step 2: Using a variable insertPos, we iterate through the array. For every non-empty crate (non-zero value), we move it to the front of the array by placing it at the insertPos index.
// Step 3: After all non-empty crates have been repositioned, we fill the rest of the array with zeros.
// Step 4: Finally, we print the updated array, which now has all empty crates moved to the end while keeping the order of non-empty crates the same.


public class Q5_MoveEmptyCrates {
    public static void main(String[] args) {
        // Example array of crates where 0 represents an empty crate
        int[] crates = {1, 0, 2, 0, 3, 4, 0, 5};

        // Print the original array of crates
        System.out.print("Original array: ");
        for (int crate : crates) {
            System.out.print(crate + " ");
        }
        System.out.println();

        /*
         * Logic:
         * 1. Initialize a pointer (insertPos) to 0.
         * 2. Loop through each element in the array.
         *    - If the element is not 0 (i.e., it's not an empty crate),
         *      then place it at the index indicated by insertPos and increment insertPos.
         * 3. After processing all elements, all non-empty crates are at the start of the array.
         * 4. Fill the rest of the array (from insertPos to end) with 0s (empty crates).
         */

        int insertPos = 0; // Pointer for placing non-empty crates

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < crates.length; i++) {
            if (crates[i] != 0) {
                crates[insertPos] = crates[i];
                insertPos++;
            }
        }

        // Fill the remaining positions in the array with 0s
        while (insertPos < crates.length) {
            crates[insertPos] = 0;
            insertPos++;
        }

        // Printing the updated array of crates with empty crates at the end
        System.out.print("Updated array: ");
        for (int crate : crates) {
            System.out.print(crate + " ");
        }
        System.out.println();
    }
}

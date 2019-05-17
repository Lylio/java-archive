import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	/*
	The very first block of blockchain has no previous transactions from which to create its
	own hash. Subsequently, an initial genesis transaction is required	
	*/

        String[] genesisTransactions = {"bob sent 15 bitcoin to sally", "davey sent 12 bitcoin to harry"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"harry sent 10 bitcoin to ron", "ali sent 250 bitcoin to mary"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"craig sent 30 bitcoin to doug", "doug sent 5 bitcoin to tesco"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("Hash of block 1: " + genesisBlock.getBlockHash());
        System.out.println("Hash of block 2: " + block2.getBlockHash());
        System.out.println("Hash of block 3: " + block3.getBlockHash());

        /*
        Changing a value in a previous block will create completely different
        hash values for itself and its following blocks -
        try changing the bitcoin transaction in block 2, rerun, and observe
        hash changes for blocks 2 and 3
         */

    }
}

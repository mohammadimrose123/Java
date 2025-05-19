package Assignment2;
	import java.util.ArrayList;
	import java.util.List;

	public class LOC {
	    public static List<String> generatePermutations(String input) {
	        List<String> result = new ArrayList<>();
	        permute(input, "", result);
	        return result;
	    }

	    private static void permute(String remaining, String current, List<String> result) {
	        if (remaining.isEmpty()) {
	            result.add(current);
	            return;
	        }
	        for (int i = 0; i < remaining.length(); i++) {
	            char letter = remaining.charAt(i);
	            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
	            permute(newRemaining, current + letter, result);
	        }
	    }

	    public static void main(String[] args) {
	        String letters = "LOC";
	        List<String> permutations = generatePermutations(letters);
	        System.out.println("All possible locker code combinations:");
	        for (String perm : permutations) {
	            System.out.println(perm);
	        }
	        System.out.println("Total permutations: " + permutations.size());
	    }
	}



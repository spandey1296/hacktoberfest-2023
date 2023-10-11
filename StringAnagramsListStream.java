public class StringAnagramsListStream {

    public static void main(String[] args) {
        String str = "cat tac atc dog god";
        String[] arr = str.trim().split(" ");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        Map<String, List<String>> result = list.stream()
                .collect(Collectors.groupingBy(StringAnagramsListStream::sortWord));
        System.out.println(result);

        List<List<String>> result1 = new ArrayList<>(list.stream()
                .collect(Collectors.groupingBy(StringAnagramsListStream::sortWord))
                .values());
        System.out.println(result1);
    }

    private static String sortWord(String word) {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}

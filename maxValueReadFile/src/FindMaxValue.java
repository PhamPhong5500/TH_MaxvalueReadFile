import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List <Integer> numbers = readAndWriteFile.readFile("C:\\codegym\\module02\\" +
                "lesson01\\TH_maxValueReadFile\\maxValueReadFile\\max.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("C:\\codegym\\module02\\" +
                "lesson01\\TH_maxValueReadFile\\maxValueReadFile\\Result.txt" , maxValue);
    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++) {
            if(max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}

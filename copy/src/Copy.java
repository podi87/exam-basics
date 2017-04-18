import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Copy {
  private static String FILE_NAME1 = "CopyFrom.csv";
  private static String FILE_NAME2 = "CopyTo";
  private static Path sourceFile = Paths.get(FILE_NAME1);
  private static Path copyToFile = Paths.get(FILE_NAME2);
  private static List<String> copiedThings = new ArrayList<>();
  private static String usage = "\n" +"Java Copy application\n" +
          "=======================\n" +
          "copy [source] [destination]"+
          "\n" +
          "Command line arguments:\n" +
          " - If you type only 'copy' and source file [source.csv]' it prints out the source\n" +
          " - If you type both arguments 'copy' and [source.csv] and [destination.csv]' the content of the source will be copied to the given destination\n";


  public static void main(String[] args) {
    CopyFunctions copyFunctions = new CopyFunctions(FILE_NAME1, FILE_NAME2, copiedThings, sourceFile, copyToFile);

    System.out.println(copiedThings);
    if (args.length == 0) {
      copyFunctions.printUsage(usage);
    } else if (args.length == 2) {
      copyFunctions.printOut(args, copiedThings, sourceFile);
    } else if (args.length == 3) {
      copyFunctions.writeFile(args, copiedThings, sourceFile, copyToFile);
    } else {
      System.out.println("Unsupported argument");
    }
  }
}
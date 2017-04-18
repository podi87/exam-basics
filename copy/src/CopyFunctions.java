import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFunctions {

  String FILE_NAME1;
  String FILE_NAME2;
  String usage;
  List<String> copiedThings;
  int num;
  Path path1;
  Path path2;
  String [] args;

  public CopyFunctions(String FILE_NAME1, String FILE_NAME2, List<String> copiedThings, Path path1, Path path2) {
    this.FILE_NAME1 = FILE_NAME1;
    this.FILE_NAME2 = FILE_NAME2;
    this.copiedThings = copiedThings;
    this.path1 = path1;
    this.path2 = path1;

  }

  public CopyFunctions() {
  }

  public void printUsage(String usage) {
    System.out.println(usage);
  }

  public void printOut(String [] args, List<String> copiedThings, Path path1) {
    FILE_NAME1 = args[1];
    path1 = Paths.get(FILE_NAME1);
    try {
      copiedThings = Files.readAllLines(path1);
    } catch (IOException e) {
      e.printStackTrace();
    }
    if (copiedThings.size() == 0) {
      System.out.println("The source file is empty");
    }
    else {
      for (int i = 0; i < copiedThings.size(); i++) {
        System.out.println(i + 1 + " - " +  copiedThings.get(i));
      }
    }
  }

  public void writeFile(String [] args, List<String> copiedThings, Path path1, Path path2) {
    FILE_NAME1 = args[1];
    FILE_NAME2 = args[2];
    path1 = Paths.get(FILE_NAME1);
    path2 = Paths.get(FILE_NAME2);
    try {
      copiedThings = Files.readAllLines(path1);
      Files.write(path2, copiedThings);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

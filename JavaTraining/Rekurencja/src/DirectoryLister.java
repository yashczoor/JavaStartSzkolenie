import java.io.File;

public class DirectoryLister {
	public static void main(String[] args) {
	DirectoryLister dl = new DirectoryLister();
	File file = new File("D:/");
	dl.showDirectiories(file);
}

	public void showDirectiories(File file) {
		File[] files = file.listFiles();

		if (files != null)
			for (File f : files) {
				if (f.isDirectory()) {
					System.out.println("folder" + f.getAbsolutePath());
					showDirectiories(f);
				} else {
					System.out.println(" plik " + f.getAbsolutePath());
				}
			}
	}
}
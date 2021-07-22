package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements IFileComponent{

    private List<IFileComponent> files = new ArrayList<>();
    
    public FolderComposite(List<IFileComponent> files) {
        this.files = files;
    }

    @Override
    public void showProperty() {
        for (IFileComponent file : files) {
            file.showProperty();
        }
        
    }

    @Override
    public long totalSize() {
        long total = 0;
        for (IFileComponent file : files) {
            total += file.totalSize();
        }
        return total;
    }
    
}

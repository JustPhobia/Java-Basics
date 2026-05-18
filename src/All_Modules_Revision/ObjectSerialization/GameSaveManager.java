package All_Modules_Revision.ObjectSerialization;

import java.io.*;

public class GameSaveManager {
    public void save(String file, GameState state) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            oos.writeObject(state);
        }
    }

    public GameState load(String file) throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            return (GameState) ois.readObject();
        }
    }
}

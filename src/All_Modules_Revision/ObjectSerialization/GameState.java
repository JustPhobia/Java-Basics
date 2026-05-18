package All_Modules_Revision.ObjectSerialization;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GameState implements Serializable {
    private static final long serialVersionUID = 1L;
    private String playerName;
    private int level;
    private double health;
    private ArrayList<String> inventory;
    private transient long sessionStartTime;


}

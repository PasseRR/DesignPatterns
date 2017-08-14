package passerr.github.io.behavioural.memento;

import lombok.*;

/**
 * @author xiehai1
 * @date 2017/08/14 10:15
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Data
@ToString(exclude = "snapshot")
public class Jar implements Undoable {
    private String groupId;
    private String artifactId;
    private String version;
    /**
     * 备份的快照
     */
    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PRIVATE)
    private Jar snapshot;

    @Override
    public void save() {
        if(null == this.snapshot){
            this.snapshot = new Jar();
        }
        this.snapshot.setGroupId(this.getGroupId());
        this.snapshot.setArtifactId(this.getArtifactId());
        this.snapshot.setVersion(this.getVersion());
    }

    @Override
    public void undo() {
        if (null != this.snapshot) {
            this.setGroupId(this.snapshot.getGroupId());
            this.setArtifactId(this.snapshot.getArtifactId());
            this.setVersion(this.snapshot.getVersion());
        }
    }
}

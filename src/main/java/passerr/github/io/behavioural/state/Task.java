package passerr.github.io.behavioural.state;

import lombok.Data;

/**
 * @author xiehai1
 * @date 2017/08/24 17:46
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Data
public class Task {
    private State state;
    private int time;
    private boolean isDone;

    public Task(int time){
        this(time, false);
    }

    public Task(int time, boolean isDone){
        this.time = time;
        this.isDone = isDone;
        this.state = new ForenoonState();
    }

    public String coding(){
        if(this.isDone()){
            this.setState(new OffDutyState());
        }

        return this.state.coding(this);
    }
}

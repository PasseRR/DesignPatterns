package passerr.github.io.behavioural.command;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xiehai1
 * @date 2017/08/08 15:43
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Getter
@Setter(AccessLevel.PROTECTED)
public class Television {
    /**
     * 电视名称
     */
    private String name;
    /**
     * 当前所在频道
     */
    private Integer channel;
    /**
     * 当前音量
     */
    private Integer volume;

    public Television(){
        this("HaierTv");
    }

    public Television(String name){
        this(name, 10, 20);
    }

    public Television(String name, Integer channel, Integer volume){
        this.name = name;
        this.channel = channel;
        this.volume = volume;
    }

    /**
     * 电视机执行遥控器命令
     * @param command 具体命令
     * @param <T> 命令返回值
     * @return 命令执行结果
     */
    public <T> T execute(Command<T> command){
        return command.execute();
    }
}

package passerr.github.io.behavioural.command;

import lombok.Setter;

/**
 * 遥控器
 * @author xiehai1
 * @date 2017/08/08 16:15
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class RemoteControl {
    private Television television;
    @Setter
    private Command<String> turnOn = () -> this.television.getName() + " on!";
    @Setter
    private Command<String> turnOff = () -> this.television.getName() + " off!";
    @Setter
    private Command<Integer> volumeUp = () -> {
        int currentVolume = this.television.getVolume();
        this.television.setVolume(++currentVolume);
        return currentVolume <= 100 ? currentVolume : 100;
    };
    @Setter
    private Command<Integer> volumeDown = () -> {
        int currentVolume = this.television.getVolume();
        this.television.setVolume(--currentVolume);
        return currentVolume >= 0 ? currentVolume : 0;
    };
    @Setter
    private Command<Integer> channelUp = () -> {
        int currentChannel = this.television.getChannel();
        this.television.setChannel(++currentChannel);
        return currentChannel <= 200 ? currentChannel : 200;
    };
    @Setter
    private Command<Integer> channelDown = () -> {
        int currentChannel = this.television.getChannel();
        this.television.setChannel(--currentChannel);
        return currentChannel > 0 ? currentChannel : 1;
    };

    public RemoteControl(Television television) {
        this.television = television;
    }

    public String turnOn() {
        return this.television.execute(turnOn);
    }

    public String turnOff() {
        return this.television.execute(turnOff);
    }

    public Integer volumeUp() {
        return this.television.execute(volumeUp);
    }

    public Integer volumeDown() {
        return this.television.execute(volumeDown);
    }

    public Integer channelUp() {
        return this.television.execute(channelUp);
    }

    public Integer channelDown() {
        return this.television.execute(channelDown);
    }
}

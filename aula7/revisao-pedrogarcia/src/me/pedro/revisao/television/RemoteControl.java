package me.pedro.revisao.television;

public class RemoteControl {
    private Television televisionInstance;

    public RemoteControl(Television instance) {
        this.televisionInstance = instance;
    }

    public boolean setChannel(int channel) {
        if(channel >= televisionInstance.getMinLimitOfChannels() && channel <= televisionInstance.getMaxLimitOfChannels()) {
            televisionInstance.currentChannel = channel;
            return true;
        }
        return false;
    }

    public boolean increaseChannel() {
        if(televisionInstance.currentChannel < televisionInstance.maxLimitOfChannels) {
            televisionInstance.currentChannel++;
            return true;
        }
        return false;
    }

    public boolean decreaseChannel() {
        if(televisionInstance.currentChannel > televisionInstance.minLimitOfChannels) {
            televisionInstance.currentChannel--;
            return true;
        }
        return false;
    }

    public boolean increaseVolume() {
        if(televisionInstance.currentVolume < televisionInstance.maxLimiOfVolume) {
            televisionInstance.currentVolume++;
            return true;
        }
        return false;
    }

    public boolean decreaseVolume() {
        if (televisionInstance.currentVolume > televisionInstance.minLimitOfVolume) {
            televisionInstance.currentVolume--;
            return true;
        }
        return false;
    }

}

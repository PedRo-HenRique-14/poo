package me.pedro.revisao.television;

public class Television {
    private RemoteControl remoteControl = new RemoteControl(this);

    protected int maxLimitOfChannels = 200; // Limita a quantidade máxima de canais
    protected int minLimitOfChannels = 1; // Limita a quantidade mínima de canais
    protected int maxLimiOfVolume = 100; // Limita o volume máximo
    protected int minLimitOfVolume = 0; // Limita o volume mínimo
    protected int currentChannel = 1;
    protected int currentVolume = 0;
    
    public int getMaxLimitOfChannels() {
        return maxLimitOfChannels;
    }

    public int getMinLimitOfChannels() {
        return minLimitOfChannels;
    }

    public int getMaxLimiOfVolume() {
        return maxLimiOfVolume;
    }

    public int getMinLimitOfVolume() {
        return minLimitOfVolume;
    }

    public RemoteControl getRemoteControl() {
        return remoteControl;
    }
    
    public int getCurrentChannel() {
        return currentChannel;
    }
    
    public int getCurrentVolume() {
        return currentVolume;
    }

    
}

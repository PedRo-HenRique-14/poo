package me.pedro.revisao.television;

public class Television {
    private RemoteControl remoteControl = new RemoteControl(this);

    int maxLimitOfChannels = 200; // Limita a quantidade máxima de canais
    int minLimitOfChannels = 1; // Limita a quantidade mínima de canais
    int maxLimiOfVolume = 100; // Limita o volume máximo
    int minLimitOfVolume = 0; // Limita o volume mínimo
    int currentChannel = 1;
    int currentVolume = 0;
    
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

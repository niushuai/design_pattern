package _08_Facade.facade;

import _08_Facade.function.ChannelSystem;
import _08_Facade.function.PowerSystem;
import _08_Facade.function.VoiceSystem;

/**
 * 儿子喜欢看世界杯，而且声音要大，这样才能嗨翻天啊！！！
 * 
 * @author niushuai
 *
 */
public class SonTVFacade {

    private PowerSystem mPowerSystem = new PowerSystem();
    private VoiceSystem mVoiceSystem = new VoiceSystem();
    private ChannelSystem mChannelSystem = new ChannelSystem();

    public void watchTV() {
        mPowerSystem.powerOn();
        mVoiceSystem.voice(10);
        mChannelSystem.select("CCAV-5(正在直播世界杯，嗨起来啊)");
    }

    public void powerOff() {
        mPowerSystem.powerOff();
    }
}

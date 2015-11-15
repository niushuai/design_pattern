package _08_Facade.facade;

import _08_Facade.function.ChannelSystem;
import _08_Facade.function.PowerSystem;
import _08_Facade.function.VoiceSystem;

/**
 * 妈妈看电视的时候，会把音量调节到比较小的声音，而且最喜欢浙江卫视= =
 * 
 * 使用外观模式后，我们可以把所有繁琐的操作直接给简化成watchTV 里，这里虽然只有3个步骤,<br>
 * 但是实际上可能还有喝水啊、嗑瓜子啊、织毛衣啊，233333.所以只要调用 watchTV 我们就都可以用外观模式搞定
 * 
 * @author niushuai
 *
 */
public class MotherTVFacade {

    private PowerSystem mPowerSystem = new PowerSystem();
    private VoiceSystem mVoiceSystem = new VoiceSystem();
    private ChannelSystem mChannelSystem = new ChannelSystem();

    public void watchTV() {
        mPowerSystem.powerOn();
        mVoiceSystem.voice(4);
        mChannelSystem.select("浙江卫视（全都是婆媳关系的片子，呵呵呵）");
    }

    public void powerOff() {
        mPowerSystem.powerOff();
    }
}

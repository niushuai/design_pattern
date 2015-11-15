package _08_Facade.function;

/**
 * 声音控制系统
 */
public class VoiceSystem {

    public void voice(Integer voice) {
        System.out.println("您将音量调节至：" + voice + "...");
    }

    public void turnUp() {
        System.out.println("音量增大");
    }

    public void turnDown() {
        System.out.println("音量减小");
    }
}
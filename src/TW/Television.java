package TW;

public class Television {
    private static int currentChannel;
    private static int maxChannels;

    public Television(int currentChannel, int maxChannels) {
        this.currentChannel = currentChannel;
        this.maxChannels = maxChannels;
    }
    public static void nextChannel() {
        currentChannel++;
        if (currentChannel > maxChannels) {
            currentChannel = 1;
        }
    }

    public static void previousChannel() {
        currentChannel--;
        if (currentChannel < 1) {
            currentChannel = maxChannels;
        }
    }
    public static void goToChannel(int channelNumber) {
        if (channelNumber >= 1 && channelNumber <= maxChannels) {
            currentChannel = channelNumber;
        } else {
            System.out.println("Неверный номер канала.");
        }
    }

    public static void displayChannel() {
        System.out.println("Текущий канал: " + channelName(currentChannel));
    }

    private  static String channelName(int channelNumber) {
        switch (channelNumber) {
            case 1:
                return channelNumber + " \"КТРК\"";
            case 2:
                return channelNumber +" \"Баластан\"";
            case 3:
                return channelNumber +" \"ЭЛТР\"";
            case 4:
                return channelNumber +" \"Спорт\"";
            case 5:
                return channelNumber +" \"Пятница\"";
            default:
                return "Неизвестный канал";
        }
    }

}

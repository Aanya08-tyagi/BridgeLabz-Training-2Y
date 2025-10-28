package Lambda_Expression;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeLighting {

    @FunctionalInterface
    interface LightAction {
        void execute(String location);
    }

    public static void main(String[] args) {
       
        LightAction motionDetected = location -> System.out.println("[Motion] " + location + ": Turn ON full brightness for 5 minutes");
        LightAction nightTime = location -> System.out.println("[Night] " + location + ": Turn ON warm dimmed lights (20%)");
        LightAction voiceCommand = location -> System.out.println("[Voice] " + location + ": Toggle light state from voice command");
        LightAction awayMode = location -> System.out.println("[Away] " + location + ": Turn OFF all lights (away mode)");

        
        Map<String, LightAction> triggers = new HashMap<>();
        triggers.put("motion", motionDetected);
        triggers.put("night", nightTime);
        triggers.put("voice", voiceCommand);
        triggers.put("away", awayMode);

        
        String[] locations = {"Living Room", "Hallway", "Porch"};
        String[] demoTriggers = {"motion", "night", "voice", "away"};

        for (String trigger : demoTriggers) {
            LightAction action = triggers.get(trigger);
            for (String loc : locations) {
                action.execute(loc);
            }
            System.out.println();
        }
    }
}

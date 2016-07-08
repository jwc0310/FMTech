package parknshop.parknshopapp.Fragment.Tutorial;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * Created by chrisyu on 8/3/16.
 */
public class TutorialPresenter {

    public static void initTutorialPanel(LinearLayout tutorialPanel, Context context, int count) {
        if(tutorialPanel.getChildCount() > 0)
            return;

        for(int i = 0; i < count; i++) {
            TutorialDot tutorialDot = new TutorialDot(context);
            if(i == 0)
                tutorialDot.enable();
            else
                tutorialDot.disable();
            tutorialPanel.addView(tutorialDot);
        }
    }


    public static void initProductDotPanel(LinearLayout tutorialPanel, Context context, int count) {
        if(count == 1) return;
        if(tutorialPanel.getChildCount() > 0)
            return;

        for(int i = 0; i < count; i++) {
            TutorialDot tutorialDot = new TutorialDot(context, true);
            if(i == 0)
                tutorialDot.enable();
            else
                tutorialDot.disable();
            tutorialPanel.addView(tutorialDot);
        }
    }

    public static void redrawDotPanel(LinearLayout tutorialPanel, int currentPosition, int count) {
        //Log.i("redrawDotPanel", "redrawDotPanel" + currentPosition + " " + count);
        for(int i = 0; i < count; i++) {
            TutorialDot tutorialDot = (TutorialDot) tutorialPanel.getChildAt(i);

            if(tutorialDot == null)
                return;

            if(i == currentPosition)
                tutorialDot.enable();
            else
                tutorialDot.disable();
        }
    }
}

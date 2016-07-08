package parknshop.parknshopapp;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

import com.orhanobut.hawk.Hawk;

import parknshop.parknshopapp.Utils.Utils;

/**
 * Created by hp on 24/4/2016.
 */
public class AnimationHelper {

    public static boolean animationInProgress = false;
    public static void slideToTop(final View view, int dp) {
        if(view.getVisibility() == View.GONE)
            return;

        if(animationInProgress)
            return;

        //Log.i("animationInProgress", "animationInProgress" + 1 + animationInProgress);

        //115
        float height = Utils.dpToPxHeight(dp, view.getContext());//view.getResources().getDimension(R.dimen.actionbar_height);
        TranslateAnimation animate = new TranslateAnimation(0, 0, 0, -height);
        animate.setDuration(500);
        animate.setFillAfter(false);

        animate.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                animationInProgress = true;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animationInProgress = false;
                view.setVisibility(View.GONE);
            }
        });


        view.startAnimation(animate);
    }

    public static void slideFromTop(final View view, int dp) {

        if(view.getVisibility() == View.VISIBLE)
            return;

        if(animationInProgress)
            return;

        //Log.i("animationInProgress", "animationInProgress" + 2 + animationInProgress);

        float height = Utils.dpToPxHeight(dp, view.getContext());//view.getResources().getDimension(R.dimen.actionbar_height);
        TranslateAnimation animate = new TranslateAnimation(0, 0, -height, 0);

        //view.getContext().getResources().getDimensionPixelSize(R.dimen.actionbar_height);
        animate.setDuration(500);
        animate.setFillAfter(true);

        view.setVisibility(View.VISIBLE);

        animate.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                animationInProgress = true;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(View.VISIBLE);
                animationInProgress = false;
            }
        });
        view.startAnimation(animate);
    }

    public static void slideToBottom(final View view, int px) {
        if(view.getVisibility() == View.GONE)
            return;

        if(animationInProgress)
            return;

        TranslateAnimation animate = new TranslateAnimation(0, 0, 0, px);
        animate.setDuration(500);
        animate.setFillAfter(false);

        animate.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                animationInProgress = true;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animationInProgress = false;
                ///view.setVisibility(View.GONE);

                if(view instanceof LinearLayout) {
                    view.findViewById(R.id.store_call_item_phone_1).setVisibility(View.GONE);
                    view.findViewById(R.id.store_call_item_phone_2).setVisibility(View.GONE);
                   // view.findViewById(R.id.store_call_item_phone_3).setVisibility(View.GONE);//store_call_item__share_to_friend
                    //view.findViewById(R.id.store_call_item__share_to_friend).setVisibility(View.GONE);
                }
            }
        });


        view.startAnimation(animate);
    }

    public static void slideToBottomGone(final View view, int px) {
        if(view.getVisibility() == View.GONE)
            return;

        if(animationInProgress)
            return;

        TranslateAnimation animate = new TranslateAnimation(0, 0, 0, px);
        animate.setDuration(500);
        animate.setFillAfter(false);

        animate.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                animationInProgress = true;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animationInProgress = false;
                view.setVisibility(View.GONE);

                if(view instanceof LinearLayout) {
                    view.findViewById(R.id.store_call_item_phone_1).setVisibility(View.GONE);
                    view.findViewById(R.id.store_call_item_phone_2).setVisibility(View.GONE);
                    // view.findViewById(R.id.store_call_item_phone_3).setVisibility(View.GONE);//store_call_item__share_to_friend
                    //view.findViewById(R.id.store_call_item__share_to_friend).setVisibility(View.GONE);
                }
            }
        });


        view.startAnimation(animate);
    }

    public static void slideToBottom(final View view) {
        if(view.getVisibility() == View.GONE)
            return;

        if(animationInProgress)
            return;

        float height = Utils.dpToPxHeight(360, view.getContext());//view.getResources().getDimension(R.dimen.actionbar_height);
        TranslateAnimation animate = new TranslateAnimation(0, 0, 0, Utils.getScreenHeight(view.getContext())+ height);
        animate.setDuration(500);
        animate.setFillAfter(false);

        animate.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                animationInProgress = true;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animationInProgress = false;
                view.setVisibility(View.GONE);
            }
        });


        view.startAnimation(animate);
    }


    public static void slideFromBottom(final View view) {

        //if(view.getVisibility() == View.VISIBLE)
        //    return;

        if(animationInProgress)
            return;


        float height = Utils.dpToPxHeight(360, view.getContext());//view.getResources().getDimension(R.dimen.actionbar_height);
        TranslateAnimation animate = new TranslateAnimation(0, 0, Utils.getScreenHeight(view.getContext()), 0);

        //view.getContext().getResources().getDimensionPixelSize(R.dimen.actionbar_height);
        animate.setDuration(500);
        animate.setFillAfter(true);

        view.setVisibility(View.VISIBLE);

        animate.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                animationInProgress = true;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animationInProgress = false;
            }
        });
        view.startAnimation(animate);
    }

    public static void slideFromBottom(final View view, int heightDp) {

        if(view.getVisibility() == View.VISIBLE)
            return;

        if(animationInProgress)
            return;

        TranslateAnimation animate = new TranslateAnimation(0, 0, Utils.getScreenHeight(view.getContext()), heightDp);

        //view.getContext().getResources().getDimensionPixelSize(R.dimen.actionbar_height);
        animate.setDuration(500);
        animate.setFillAfter(true);

        view.setVisibility(View.VISIBLE);

        animate.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                animationInProgress = true;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animationInProgress = false;
            }
        });
        view.startAnimation(animate);
    }

    public static void slideFromBottomByPx(final View view, int pxHeight, Context context) {


        if(view.getVisibility() == View.VISIBLE)
            return;

        if(animationInProgress)
            return;

        //Log.i("TranslateAnimation", "TranslateAnimation" + Utils.getScreenHeight(context) + " " + pxHeight);
        TranslateAnimation animate = new TranslateAnimation(0, 0, Utils.getScreenHeight(context), 0);

        //view.getContext().getResources().getDimensionPixelSize(R.dimen.actionbar_height);
        animate.setDuration(500);
        animate.setFillAfter(true);

        view.setVisibility(View.VISIBLE);

        animate.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                animationInProgress = true;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animationInProgress = false;
            }
        });
        view.startAnimation(animate);
    }


    public static void slideFromBottom(final View view, int from, int to) {


        if(animationInProgress)
            return;

        TranslateAnimation animate = new TranslateAnimation(0, 0, from, to);

        //view.getContext().getResources().getDimensionPixelSize(R.dimen.actionbar_height);
        animate.setDuration(500);
        animate.setFillAfter(true);

        view.setVisibility(View.VISIBLE);

        animate.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                animationInProgress = true;
                if(view.findViewById(R.id.store_call_item_phone_1) != null)
                    view.findViewById(R.id.store_call_item_phone_1).setVisibility(View.VISIBLE);

                if(Hawk.get("showPhone2Needed", false))
                    if(view.findViewById(R.id.store_call_item_phone_2) != null)
                        view.findViewById(R.id.store_call_item_phone_2).setVisibility(View.VISIBLE);
                //view.findViewById(R.id.store_call_item_phone_3).setVisibility(View.VISIBLE);
                // store_call_item__share_to_friend
                //view.findViewById(R.id.store_call_item__share_to_friend).setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animationInProgress = false;
            }
        });
        view.startAnimation(animate);
    }

    public static void fadeInAnimation(final View view, Context context){
		/*Animation fadeInAnimation = AnimationUtils.loadAnimation(context, R.anim.abc_fade_in);
		fadeInAnimation.setAnimationListener(new AnimationListener() {

			@Override
			public void onAnimationStart(Animation animation) {
			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}

			@Override
			public void onAnimationEnd(Animation animation) {
			}
		});
		// Now Set your animation
		view.startAnimation(fadeInAnimation);*/
    }
}

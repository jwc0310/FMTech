package parknshop.parknshopapp.Fragment.Product.CrazySale;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.google.android.youtube.player.YouTubePlayer;
import com.thefinestartist.ytpa.YouTubePlayerActivity;
import com.thefinestartist.ytpa.enums.Orientation;
import com.thefinestartist.ytpa.utils.YouTubeUrlParser;

import butterknife.Bind;
import butterknife.ButterKnife;
import parknshop.parknshopapp.Base.BaseFragment;
import parknshop.parknshopapp.R;

/**
 * Created by chrisyu on 30/3/16.
 */
public class CrazySaleHeaderFragment extends BaseFragment {
    public @Bind(R.id.video_view) VideoView videoView;
    public @Bind(R.id.image_view) ImageView imageView;
    public @Bind(R.id.play_btn) ImageView playBtn;
    public String loadUrl;

    private MediaController mController;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.crazy_sale_header_fragment, container, false);
        ButterKnife.bind(this, view);

        videoView.setVisibility(View.GONE);
        if(loadUrl != null &&loadUrl.contains("youtube")) {
            final String utubeId = YouTubeUrlParser.getVideoId(loadUrl);

            imageView.setVisibility(View.VISIBLE);
            playBtn.setVisibility(View.VISIBLE);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getBaseActivity(), YouTubePlayerActivity.class);

                    intent.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, utubeId);

                    intent.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, YouTubePlayer.PlayerStyle.DEFAULT);

                    intent.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, Orientation.AUTO);

                    intent.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, true);

                    intent.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);

                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            });
            Glide.with(getBaseActivity()).load("http://img.youtube.com/vi/" + utubeId + "/default.jpg").into(imageView);
        } else {
            imageView.setVisibility(View.VISIBLE);
            playBtn.setVisibility(View.GONE);
            Glide.with(getBaseActivity()).load(loadUrl).into(imageView);
            //Log.i("loadUrl", "loadUrl" + loadUrl);
        }
        return view;
    }
}

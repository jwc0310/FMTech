import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.poll.views.PollOptionVoterListItemView;
import java.util.ArrayList;

final class jvk
  extends ArrayAdapter<jws>
{
  public jvk(Context paramContext, ArrayList<jws> paramArrayList)
  {
    super(paramContext, 0, paramArrayList);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    PollOptionVoterListItemView localPollOptionVoterListItemView = (PollOptionVoterListItemView)paramView;
    if (localPollOptionVoterListItemView == null) {
      localPollOptionVoterListItemView = (PollOptionVoterListItemView)LayoutInflater.from(paramViewGroup.getContext()).inflate(efj.TL, paramViewGroup, false);
    }
    jws localjws = (jws)getItem(paramInt);
    String str1 = localjws.a;
    String str2 = localjws.c;
    localPollOptionVoterListItemView.a.a(str1, str2);
    String str3 = localjws.b;
    localPollOptionVoterListItemView.b.setText(str3);
    return localPollOptionVoterListItemView;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvk
 * JD-Core Version:    0.7.0.1
 */
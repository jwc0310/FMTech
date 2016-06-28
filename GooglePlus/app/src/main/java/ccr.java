import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.apps.plus.views.EventThemeView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class ccr
  extends hqi
{
  public ccr(cco paramcco, Context paramContext, Cursor paramCursor)
  {
    super(paramContext, null);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(efj.tH, paramViewGroup, false);
    localView.setTag(new ccs(this, (ProgressBar)localView.findViewById(aaw.hV)));
    return localView;
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    ProgressBar localProgressBar = (ProgressBar)paramView.findViewById(aaw.hV);
    localProgressBar.setVisibility(0);
    EventThemeView localEventThemeView = (EventThemeView)paramView.findViewById(aaw.el);
    localEventThemeView.F = ((iqp)paramView.getTag());
    String str1 = paramCursor.getString(2);
    String str2 = paramCursor.getString(3);
    cco localcco = this.f;
    String str3 = Uri.parse(str1).getLastPathSegment();
    Matcher localMatcher;
    if (!TextUtils.isEmpty(str3))
    {
      localMatcher = localcco.a.matcher(str3);
      if ((!localMatcher.find()) || (localMatcher.groupCount() != 2)) {}
    }
    for (String str4 = localMatcher.group(2).replaceAll("[-_]", " ");; str4 = null)
    {
      localEventThemeView.setContentDescription(str4);
      if (!TextUtils.isEmpty(str2)) {
        localProgressBar.setVisibility(8);
      }
      localEventThemeView.a(str1, str2);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ccr
 * JD-Core Version:    0.7.0.1
 */
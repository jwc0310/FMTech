import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.plus.views.AutoAwesomeMovieTileView;
import com.google.android.libraries.social.media.ui.MediaView;

public final class cxy
  extends dej
{
  public cxy(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    this.a = aau.ch;
    this.b = aau.ci;
  }
  
  protected final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(efj.sL, paramViewGroup, false);
  }
  
  protected final void a(Cursor paramCursor, View paramView)
  {
    AutoAwesomeMovieTileView localAutoAwesomeMovieTileView = (AutoAwesomeMovieTileView)paramView;
    String str1 = paramCursor.getString(3);
    long l = paramCursor.getLong(9);
    String str2 = paramCursor.getString(1);
    String str3 = paramCursor.getString(5);
    ipm localipm = jrf.a(l);
    ipf localipf = ipf.a(this.aM, str2, str3, localipm);
    String str4 = paramCursor.getString(2);
    localAutoAwesomeMovieTileView.setTag(aaw.kX, str4);
    localAutoAwesomeMovieTileView.a.setText(str1);
    localAutoAwesomeMovieTileView.b.a(localipf);
    localAutoAwesomeMovieTileView.setOnClickListener(this.k);
    localAutoAwesomeMovieTileView.setTag(aaw.la, Long.valueOf(l));
    localAutoAwesomeMovieTileView.setLayoutParams(new lyc(2, -3, this.h, 1));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxy
 * JD-Core Version:    0.7.0.1
 */
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.plus.widget.EsWidgetConfigurationActivity;

public final class ean
  extends ra
{
  public ean(EsWidgetConfigurationActivity paramEsWidgetConfigurationActivity, Context paramContext)
  {
    super(paramContext, null, 0);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(efj.wL, null);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    ((TextView)paramView.findViewById(aaw.bn)).setText(paramCursor.getString(2));
    TextView localTextView = (TextView)paramView.findViewById(aaw.bm);
    if ((0x1 & paramCursor.getInt(5)) != 0) {
      localTextView.setText(null);
    }
    ImageView localImageView;
    for (;;)
    {
      localImageView = (ImageView)paramView.findViewById(aaw.bl);
      if (!"v.whatshot".equals(paramCursor.getString(1))) {
        break;
      }
      localImageView.setImageResource(efj.Hm);
      return;
      int i = paramCursor.getInt(6);
      localTextView.setText(13 + "(" + i + ")");
    }
    localImageView.setImageResource(efj.qL);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ean
 * JD-Core Version:    0.7.0.1
 */
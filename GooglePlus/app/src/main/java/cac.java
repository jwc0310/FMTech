import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class cac
  extends hqi
{
  public cac(Context paramContext)
  {
    super(paramContext, null);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(efj.uv, paramViewGroup, false);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    ImageView localImageView = (ImageView)paramView.findViewById(16908294);
    TextView localTextView1 = (TextView)paramView.findViewById(16908310);
    TextView localTextView2 = (TextView)paramView.findViewById(16908293);
    switch (paramCursor.getInt(1))
    {
    }
    for (;;)
    {
      localTextView1.setText(paramCursor.getString(2));
      String str = paramCursor.getString(3);
      if (TextUtils.isEmpty(str)) {
        break;
      }
      localTextView2.setVisibility(0);
      localTextView2.setText(str);
      return;
      localImageView.setVisibility(0);
      localImageView.setImageResource(efj.px);
      continue;
      localImageView.setVisibility(8);
      continue;
      localImageView.setVisibility(0);
      localImageView.setImageResource(efj.pv);
    }
    localTextView2.setVisibility(8);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cac
 * JD-Core Version:    0.7.0.1
 */
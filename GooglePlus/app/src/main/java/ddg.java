import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class ddg
  extends hqi
{
  final int f;
  
  public ddg(Context paramContext, Cursor paramCursor, int paramInt)
  {
    super(paramContext, null);
    this.f = paramInt;
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(efj.uK, null);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    String str1 = paramCursor.getString(0);
    String str2 = paramCursor.getString(9);
    ((TextView)paramView.findViewById(aaw.lT)).setText(efj.a(paramCursor));
    TextView localTextView1 = (TextView)paramView.findViewById(aaw.lS);
    String str3 = paramCursor.getString(1);
    localTextView1.setText(str3);
    ((TextView)paramView.findViewById(aaw.fG)).setText(paramCursor.getString(10));
    ImageView localImageView = (ImageView)paramView.findViewById(16908294);
    TextView localTextView2 = (TextView)paramView.findViewById(aaw.lQ);
    if (paramCursor.isNull(8))
    {
      localImageView.setImageResource(efj.qI);
      localTextView2.setText(efj.b(paramContext, paramCursor));
    }
    for (;;)
    {
      ((TextView)paramView.findViewById(aaw.lR)).setText(efj.a(paramContext, paramCursor));
      if ((dun.b()) && (!TextUtils.isEmpty(str2)))
      {
        localTextView1.setText(String.valueOf(str3).concat(" [Log]"));
        ((LinearLayout)paramView).setOnClickListener(new ddh(this, str2, paramContext, str3, str1));
      }
      return;
      localImageView.setImageResource(efj.qJ);
      localTextView2.setText(paramCursor.getString(8));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ddg
 * JD-Core Version:    0.7.0.1
 */
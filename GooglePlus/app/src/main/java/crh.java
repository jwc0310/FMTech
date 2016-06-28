import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

public final class crh
  implements mbo, mes, mfd
{
  final bp a;
  gzj b;
  
  public crh(bp parambp, mek parammek)
  {
    this.a = parambp;
    parammek.a(this);
  }
  
  private final AlertDialog a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2, View.OnClickListener paramOnClickListener3)
  {
    AlertDialog localAlertDialog = new AlertDialog.Builder(new ContextThemeWrapper(this.a, efj.yW)).setCancelable(paramBoolean).create();
    LinearLayout localLinearLayout = (LinearLayout)this.a.getLayoutInflater().inflate(efj.sp, null);
    ((TextView)localLinearLayout.findViewById(aaw.lC)).setText(paramInt1);
    TextView localTextView = (TextView)localLinearLayout.findViewById(aaw.lu);
    String str1 = this.a.getString(paramInt3);
    localTextView.setText(this.a.getString(paramInt2, new Object[] { str1 }));
    crs localcrs = new crs(this, paramOnClickListener1, localTextView);
    CharSequence localCharSequence = localTextView.getText();
    String str2 = localCharSequence.toString();
    crr localcrr = new crr(localcrs);
    int i = str2.indexOf(str1);
    int j = i + str1.length();
    if (i != -1)
    {
      if (!(localCharSequence instanceof Spannable)) {
        break label314;
      }
      ((Spannable)localCharSequence).setSpan(localcrr, i, j, 33);
    }
    for (;;)
    {
      MovementMethod localMovementMethod = localTextView.getMovementMethod();
      if ((localMovementMethod == null) || (!(localMovementMethod instanceof LinkMovementMethod))) {
        localTextView.setMovementMethod(LinkMovementMethod.getInstance());
      }
      Button localButton1 = (Button)localLinearLayout.findViewById(aaw.aR);
      localButton1.setText(paramInt4);
      localButton1.setOnClickListener(new crp(this, paramOnClickListener2, localAlertDialog));
      Button localButton2 = (Button)localLinearLayout.findViewById(aaw.aQ);
      localButton2.setText(paramInt5);
      localButton2.setOnClickListener(new crq(this, paramOnClickListener3, localAlertDialog));
      localAlertDialog.setView(localLinearLayout);
      return localAlertDialog;
      label314:
      SpannableString localSpannableString = SpannableString.valueOf(localCharSequence);
      localSpannableString.setSpan(localcrr, i, j, 33);
      localTextView.setText(localSpannableString);
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((gzj)parammbb.a(gzj.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    Intent localIntent = this.a.getIntent();
    String str;
    int i;
    if (localIntent.hasExtra("auto_backup_reminder_type_key"))
    {
      str = localIntent.getStringExtra("auto_backup_reminder_type_key");
      i = localIntent.getIntExtra("auto_backup_account_id", -1);
      if (i == -1) {
        throw new IllegalArgumentException("Must have an valid account id to show ab reminder");
      }
      if (!"auto_backup_off_reminder".equals(str)) {
        break label275;
      }
      localbp3 = this.a;
      localgxr3 = new gxr();
      localgxq5 = new gxq(pjm.b);
      localgxr3.b.add(localgxq5);
      localgxq6 = new gxq(pjt.e);
      localgxr3.b.add(localgxq6);
      new gwz(4, localgxr3).b(localbp3);
      a(false, aau.ay, aau.av, aau.aw, aau.az, aau.ax, new cri(this, i), new crj(this, i, str), new crl(this, i, str)).show();
      localbp4 = this.a;
      localgxr4 = new gxr();
      localgxq7 = new gxq(pjm.a);
      localgxr4.b.add(localgxq7);
      localgxq8 = new gxq(pjx.a);
      localgxr4.b.add(localgxq8);
      new gwz(-1, localgxr4).b(localbp4);
    }
    label275:
    while (!"auto_backup_general_reminder".equals(str))
    {
      bp localbp3;
      gxr localgxr3;
      gxq localgxq5;
      gxq localgxq6;
      bp localbp4;
      gxr localgxr4;
      gxq localgxq7;
      gxq localgxq8;
      return;
    }
    bp localbp1 = this.a;
    gxr localgxr1 = new gxr();
    gxq localgxq1 = new gxq(pjm.g);
    localgxr1.b.add(localgxq1);
    gxq localgxq2 = new gxq(pjt.e);
    localgxr1.b.add(localgxq2);
    new gwz(4, localgxr1).b(localbp1);
    new eg(this.a).a(null, efj.Fl);
    a(true, aau.aE, aau.aA, aau.aB, aau.aC, aau.aD, new crm(this, i), new crn(this), new cro(this, i)).show();
    bp localbp2 = this.a;
    gxr localgxr2 = new gxr();
    gxq localgxq3 = new gxq(pjm.f);
    localgxr2.b.add(localgxq3);
    gxq localgxq4 = new gxq(pjx.a);
    localgxr2.b.add(localgxq4);
    new gwz(-1, localgxr2).b(localbp2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     crh
 * JD-Core Version:    0.7.0.1
 */
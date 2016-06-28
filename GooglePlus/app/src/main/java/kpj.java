import android.content.Intent;
import com.google.android.libraries.social.silentfeedback.impl.SilentFeedbackService;

public final class kpj
  implements fsf
{
  public kpj(SilentFeedbackService paramSilentFeedbackService, fti paramfti, Intent paramIntent, fsc paramfsc) {}
  
  public final void a()
  {
    try
    {
      fti localfti = this.c;
      SilentFeedbackService localSilentFeedbackService = this.b;
      Intent localIntent = this.d;
      ftn localftn = (ftn)mbb.a(localSilentFeedbackService.getApplication(), ftn.class);
      if (localIntent != null)
      {
        localftn.b(" ");
        localftn.a(true);
        if (localIntent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.exceptionClass")) {
          localftn.d(localIntent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.exceptionClass"));
        }
        if (localIntent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.stackTrace")) {
          localftn.h(localIntent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.stackTrace"));
        }
        if (localIntent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingClass")) {
          localftn.f(localIntent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingClass"));
        }
        if (localIntent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingFile")) {
          localftn.e(localIntent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingFile"));
        }
        if (localIntent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingLine")) {
          localftn.a(localIntent.getIntExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingLine", -1));
        }
        if (localIntent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingMethod")) {
          localftn.g(localIntent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingMethod"));
        }
        if (localIntent.hasExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.categoryTag")) {
          localftn.c(localIntent.getStringExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.categoryTag"));
        }
      }
      localfti.a(localftn.a()).a(new kpk(this));
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      this.b.a();
    }
  }
  
  public final void b() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kpj
 * JD-Core Version:    0.7.0.1
 */
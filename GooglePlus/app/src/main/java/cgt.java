import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;

final class cgt
  implements Runnable
{
  cgt(cgr paramcgr) {}
  
  public final void run()
  {
    if ((this.a.aN) && (this.a.aM != null) && (this.a.aL != null) && (this.a.aL.isEnabled()))
    {
      this.a.aL.requestFocus();
      efj.j(this.a.aL);
      if (this.a.I()) {
        this.a.H();
      }
    }
    this.a.aN = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cgt
 * JD-Core Version:    0.7.0.1
 */
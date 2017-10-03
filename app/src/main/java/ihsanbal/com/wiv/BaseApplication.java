package ihsanbal.com.wiv;

import android.app.Application;

import com.bumptech.glide.request.target.ViewTarget;

/**
 * Created by hungnguyen on 10/2/17.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ViewTarget.setTagId(R.id.glide_tag);
    }
}

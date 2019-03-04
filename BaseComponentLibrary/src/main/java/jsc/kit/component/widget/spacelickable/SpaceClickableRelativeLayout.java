package jsc.kit.component.widget.spacelickable;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import jsc.kit.component.IViewAttrDelegate;

/**
 * 可监听空白处点击的RelativeLayout
 * <br>Email:1006368252@qq.com
 * <br>QQ:1006368252
 * <br><a href="https://github.com/JustinRoom/JSCKit" target="_blank">https://github.com/JustinRoom/JSCKit</a>
 *
 * @author jiangshicheng
 */
public class SpaceClickableRelativeLayout extends RelativeLayout implements IViewAttrDelegate {

    private SpaceClickHelper<SpaceClickableRelativeLayout> spaceClickHelper = null;

    public SpaceClickableRelativeLayout(Context context) {
        super(context);
        initAttr(context, null, 0);
    }

    public SpaceClickableRelativeLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initAttr(context, attrs, 0);
    }

    public SpaceClickableRelativeLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAttr(context, attrs, defStyleAttr);
    }

    @Override
    public void initAttr(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        spaceClickHelper = new SpaceClickHelper<>(this);
    }

    public void setOnSpaceClickListener(OnSpaceClickListener<SpaceClickableRelativeLayout> onSpaceClickListener) {
        spaceClickHelper.setOnSpaceClickListener(onSpaceClickListener);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return spaceClickHelper.onTouchEvent(event);
    }
}

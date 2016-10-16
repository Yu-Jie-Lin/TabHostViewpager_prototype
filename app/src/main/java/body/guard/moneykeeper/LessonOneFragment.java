package body.guard.moneykeeper;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Field;

/**
 * Created by jay_5_000 on 2016/9/12.
 */
public class LessonOneFragment extends Fragment
{
    //顯示文字內容
    private String text = "";

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);

        //取得MainActivity的方法，將文字放入text字串
        MoneyKeeperActivity mMainActivity = (MoneyKeeperActivity) activity;
        //text = mMainActivity.getLessonOneText();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        try {
            Field childFragmentManager = Fragment.class.getDeclaredField("mChildFragmentManager");
            childFragmentManager.setAccessible(true);
            childFragmentManager.set(this, null);

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //導入Tab分頁的Fragment Layout
        return inflater.inflate(R.layout.fragment_1, null);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        //取得TextView元件並帶入text字串
//        TextView mText = (TextView) getView().findViewById(R.id.tab_text);
//        mText.setText(text);
//
//        //取得ImageView元件並帶入指定圖片
//        ImageView mImg = (ImageView) getActivity().findViewById(R.id.tab_image);
//        mImg.setImageResource(R.drawable.lesson1_img);
    }
}


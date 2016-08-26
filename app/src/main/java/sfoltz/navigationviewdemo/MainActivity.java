package sfoltz.navigationviewdemo;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private NavigationView mMainDrawer;
    private ActionBar mActionBar;
    private DrawerLayout mDrawerLayout;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mActionBar = getSupportActionBar();
        mActionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
        mActionBar.setDisplayHomeAsUpEnabled(true);

        mDrawerLayout = (DrawerLayout)findViewById(R.id.navigation_drawer_layout);


        mMainDrawer = (NavigationView)findViewById(R.id.main_drawer);
        if(mMainDrawer != null){
            setupNavigationDrawerContent(mMainDrawer);
        }

        setupNavigationDrawerContent(mMainDrawer);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void setupNavigationDrawerContent(NavigationView navigationView) {
        mMainDrawer.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                Fragment fragment = new Fragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                mTextView = (TextView)findViewById(R.id.textView);
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        menuItem.setChecked(true);
                        mTextView.setText(menuItem.getTitle());
                        mDrawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.about:
                        menuItem.setChecked(true);
                        mTextView.setText(menuItem.getTitle());
                        mDrawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.skills:
                        menuItem.setChecked(true);
                        mTextView.setText(menuItem.getTitle());
                        mDrawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.projects:
                        menuItem.setChecked(true);
                        mTextView.setText(menuItem.getTitle());
                        mDrawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.work:
                        menuItem.setChecked(true);
                        mTextView.setText(menuItem.getTitle());
                        mDrawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.social:
                        menuItem.setChecked(true);
                        mTextView.setText(menuItem.getTitle());
                        mDrawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                }
                return true;
            }
        });
    }
}

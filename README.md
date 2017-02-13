# Simple TabLayout With ViewPager Android

implement with custom **PageAdapter**

## Config ViewPager


First , create your custom <code>PagerAdapter</code> extends <code>FragmentStatePagerAdapter</code> and override some method.
and on MainActivity you can use with method <code>addOnPageChangeListener()</code> after instance to change layout when swipe. Configure layout tab fragment in class <code>Pager</code>, for example :

``` java
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TabSatu();

            case 1:
                return new TabDua();
        }
        return null;
    }
```

and with change title with String Array, for example method 

``` java
    public CharSequence getPageTitle(int position) {
         return tabTitles[position];
    }
```

TabLayout setup with ViewPager use method <code>setupWithViewPager()</code> with return object ViewPager.


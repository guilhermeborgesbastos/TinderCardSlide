# TinderCardSlide
Complete component for those who need a deck of dynamic and interactive charts for Android. Much like what we found in Tinder. Fully open source for changes and improvements.

| Gif | Video |
| --- | --- |
| ![TinderSwipeBastos_animated](https://meucomercioeletronico.com/tutorial/TinderSwipeBastos_animated_EN.gif)  | [![VIDEO](https://img.youtube.com/vi/wOwl3-tdmvs/0.jpg)](https://www.youtube.com/watch?v=wOwl3-tdmvs) |
  

## Installation
Just import the Git project to your editor (Android Studio / Eclipse, etc ...)

## Settings and useful information


#### Populating the cards
In SlideCardFragment.java file (See file: https://goo.gl/BqJaNp), we have the following code:

```
    //Populo o POJO com registros de teste ( Pode busca-los da sua API )
    recordSet = new ArrayList<>();
    
    Notification notification1 =  new Notification();
    notification1.setNome("Guilherme");
    notification1.setSobrenome("B. Bastos");
    notification1.setFoto("uploads/userprofile/A20CF1B8FFB203B95C40EB3BAFE4F78C.jpg");
    notification1.setNome_cidade("São Paulo");
    notification1.setNome_estado("SP");
    recordSet.add(notification1);
    
    Notification notification3 =  new Notification();
    notification3.setNome("Mark");
    notification3.setSobrenome("Zuckerberg");
    notification3.setFoto("uploads/userprofile/A20CF1B8FFA5f64as5saopds58asAFE4F78C.jpg");
    notification3.setNome_cidade("Palo Alto");
    notification3.setNome_estado("CA");
    recordSet.add(notification3);
    
    Notification notification2 =  new Notification();
    notification2.setNome("Bill");
    notification2.setSobrenome("Gates");
    notification2.setFoto("uploads/userprofile/A20CF1B8FFA84d58ad6s89qBAFE4F78C.jpg");
    notification2.setNome_cidade("Washington");
    notification2.setNome_estado("NE");
    recordSet.add(notification2);
    
    Notification notification4 =  new Notification();
    notification4.setNome("Stev");
    notification4.setSobrenome("Jobs");
    notification4.setFoto("uploads/userprofile/ADHJOD8asd121B8FFAd6s89qBAFE4F78C.jpg");
    notification4.setNome_cidade("Palo Alto");
    notification4.setNome_estado("CA");
    recordSet.add(notification4);
```
The above load the POJO, generating a List <Notification> RecordSet, each instance on this list will be a new Card.


#### What are the gradle's dependencies?

To treat the image we use:
```
    compile 'com.mikhaellopez:circularimageview:3.0.2'
    compile 'com.squareup.picasso:picasso:2.5.2'
```

#### Changing the card rotation angle?

To change the card rotation angle just change the constant:
```
    private float ROTATION_DEGREES = 10.f;
```
Standing in line 27 SlideLaunchAdapterView.java file (See file: https://goo.gl/BCiK1T).
Or you can change it in XML, changing the same constant ROTATION_DEGREES.

#### How to programmatically run the slide card?

To remove the card with the animation programmatically just create your listener with the following example code:

```
    // to RIGHT
    viewHolder.btnIgnore.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flingContainer.getTopCardListener().selectRight();
        }
    });
    
    // to LEFT
    viewHolder.btnIgnore.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            flingContainer.getTopCardListener().selectLeft();
        }
    });
```


### Conclusion

With this component can do various applications easily and quickly.

I hope it helped you!

I am a willingness to ask questions:
guilhermeborgesbastos@gmail.com

## Thanks

com.nkdroid


## Contact
[![VIDEO](https://media.licdn.com/mpr/mpr/shrinknp_100_100/AAEAAQAAAAAAAAgiAAAAJGMwMTQwNTMyLTU2N2EtNDM1NS1iZDMxLTI2ZjVhZDRlNjM2Mw.jpg)](https://www.facebook.com/guilherme.borgesbastos)

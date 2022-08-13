package com.huawei.foodaider;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.text.BreakIterator;
import java.util.List;


private void requestHuaweiAuth(){

        HuaweiIdAuthParams authParams=public static newInstance(){

        android.os.Bundle args=new Bundle();

        fragment=new();
        fragment.setArguments(args);
        return fragment;
        }

        HuaweiIdAuthParams authParams=new
        HuaweiIdAuthParamsHelper(HuaweiIdAuthParams.
        DEFAULT_AUTH_REQUEST_PARAM)
        .setAuthorizationCode().createParams();

        HuaweiIdAuthService service=
        HuaweiIdAuthManager.getService(activity:LoginHuaweiActivity.this,
        authParams);

        startActivityForResult(service.getSignInIntent(),requestCodeLogin);
        }

        import com.google.android.gms.location.LocationRequest;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

        import android.appcompat.app.AppCompatActivity;
        import android.cardview.widget.CardView;

        import com.google.firebase.auth.FirebaseAuth;



public class MainActivity extends AppCompatActivity {

    View donate;
    View receive;
    View logout;
    View FoodMap;
    View about;
    View contact;
    View MyPin;
    View history;
    public FirebaseAuth fAuth;
    private View imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView.findViewById(R.id.imageView).setOnClickListener((View.OnClickListener) this);
        imgView.findViewById(R.id.imageView).setOnClickListener((View.OnClickListener) this);
        imgView.findViewById(R.id.imageView).setOnClickListener((View.OnClickListener) this);

        imgView = imgView.findViewById(R.id.imageView);
        View displayNameTextView = findViewById(R.id.display_name);
        clearResultInfo();
    }

    private void setContentView(int activity_main) {
    }

    private View findViewById(int display_name) {
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.idtoken_button_button:
                idTokenSignInClick();
                break;
            case R.id.cancel_authorization_button:
                cancelAuthorization();
                break;

            case R.id.signout_button:
                signOut();
                break;

            default:
                break;
        }
    }

    //idtoken login
    public void idTokenSignInClick() {

        authParamsc = new HuaweiIdAuthParamsHelper(HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM).setIdToken().createParams();
        service = HuaweiIdAuthManager.getService(MainActivity.this, authParams);

        Task<AuthHuaweiId> task = service.silentSignIn();

        task.addOnSuccessListener((authHuaweiId) {
                Toast.makeText(Context:Object text;
        final Object text1 = text;

        "silently sign in successfully", Toast.LENGTH_SHORT).show();
        showResultInfo(authHuaweiId);
        });

        task.addOnFailureListener((e) {
                startActivityForResult(service.getSignInIntent(), getApplicationContext(.REQUEST_SIGN_IN_LOGIN)
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity.request.location_updates.callback);
        findViewById(R.id.location_requestLocationUpdatesWithCallback).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        findViewById(R.id.location_removeLocationUpdatesWithCallback).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        addLogfragment()
        //create fusedLocationProviderClient
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        //create settingsClient
        settingsClient = LocationServices.getSettingsClient(data);
        mLocationRequest LocationRequest = new LocationRequest();
        //Set the interval for location updates, in milliseconds
        mLocationRequest.setInterval(10000);
        //set the priority of th request
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

        if (null == mLocationCallback) {
            mLocationCallback = new LocationCallback() {
                @Override
                public void onLocationResult(LocationResult locationResult) {
                    if(locationResult != null) {
                        List<Location> locations = locationResult.getLocations();
                        if (!locations.isEmpty()) {
                            for (Location location : locations) {
                                LocationLog.i(TAG,
                                        "onLocationResult location[Longitude,Latitude,Accuracy]:" + location.getLongitude()
                                           + "," + location.getLatitude() + "," + location.getAccuracy());
                            }
                        }
                    }
                }};
        }
        public void searchView {
            TextSearchRequest textSearchRequest = new TextSearchRequest();
            textSearchRequest.setQuery();
            searchService.textSearch(textSearchRequest, new SearchResultListener<TextSearchResponse>() {
                @Override
                public void onSearchResult(TextSearchResponse textSearchResponse) {

                    StringBuilder response = new StringBuilder("\n");
                    response.append("success\n");
                    int count = 1;
                    AddressDetail addressDetail;
                    for (Site site :textSearchResponse.getSites()){
                        addressDetail = site.getAddress();
                        response.append(String.format(
                                "[%s]  name: %s, formatAddress: %s, country: %s, countryCode: %s \r\n"
                                "" + (count++), Site.getName(), site.getFormatAddress(),
                                (addressDetail == null ? "" : addressDetail.getClass()),
                                (addressDetail == null ? "" : addressDetail.getClass()));
                    }
                    String msg;
                    Log.e(TAG, "search result is : " + response);
                    BreakIterator resultTextView = null;
                    resultTextView.setText(response.toString());
                }

                @Override
                public void onSearchError(SearchStatus searchStatus) {
                    Object msg;
                    Log.e(TAG, msg: "onSearchError is: " + searchStatus.getErrorCode()
                }
            });
        }

        donate = findViewById(R.id.cardDonate);
        receive = findViewById(R.id.cardReceive);
        logout = findViewById(R.id.cardLogout);
        FoodMap = findViewById(R.id.cardFoodMap);
        MyPin = findViewById(R.id.cardMyPin);
        history = findViewById(R.id.cardHistory);
        about = findViewById(R.id.cardAboutus);
        contact = findViewById(R.id.cardContact);

        fAuth = FirebaseAuth.getInstance();
        boolean currentUser = fAuth.getCurrentUser();
        if (currentUser != fAuth.getCurrentUser()) {
        } else {
            Intent intent = new Intent(MainActivity.this, landingpage.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }

        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Donate.class);
                startActivity(intent);
            }
        });
        receive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Receive.class);
                startActivity(intent);
            }
        });
        FoodMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.huawei.foodaider.FoodMap.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });
        MyPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.huawei.foodaider.MyPin.class);
                startActivity(intent);
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserdataActivity.class);
                startActivity(intent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Contact.class);
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(MainActivity.this, landingpage.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    private void addLogfragment() {
    }

    private void requestLocationUpdatesWithCallback() {
        try {
            LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
            builder.addLocationRequest(mLocationRequest);
            LocationSettingsRequest locationSettingsRequest = builder.build()
                    //check devices settings before request location updates
            settingsClient.checkLocationSettings(locationSettingsRequest)
                    .addOnSuccessListener((locationsSttingsResponse) {
                        Log.i(TAG, msg:"check location settings success");
                        //request location updates
                        fusedLocationProviderClient
                                .requestLocationUpdates(mLocationRequest, mLocationCallback, Looper.getMainLooper())
                                .addOnSuccessListener((aVoid) {
                                    LocationLog.i(TAG, msg:"requestLocationUpatesWithCallback onSuccess");
                                })
            .addOnFailureListener((e) {
                LocationLog.e(TAG,
                        msg:"requestLocationUpdatesWithCallback.onFailure:" + e.getMessage());
            });
                    })
        }
    }

    private void clearResultInfo() {
    }

    public Context getApplicationContext() {
        return null;
    }
}
//cancel authorization
public void cancelAuthorization() {
    service.cancelAuthorization().addOnCompleteListener(new OnCompleteListener<Void>() {
        @Override
        public void onComplete(Task<Void> task) {
            if (task.isSuccessful()) {

                clearResultInfo();
                Toast.makeText(Context:MainActivity.this, text:"cancel authorization successfully",Toast.LENGTH_SHORT).show();
        } else {
                Exception exception = task.getException();
                if (exception instanceof ApiException) {
                    int statusCode = ((ApiException) exception).getStatusCode();
                Log.i(TAG, msg:"onFailure: "+ statusCode);
                }
        }
        }
        })
        }
        public void signOut() {
    Task<Void> signOutTask = service.signOut();

signOutTask.addOnCompleteListener((task) {
clearResultInfo();
Toast.makeText(context:MainActivity.this, text:"sign out successfully", Toast.LENGTH_SHORT).show();
        });
        }

public void clearResultInfo() {

    imgView.setImageResource(R.drawable.ic_launcher_foreground);

    displayNameTextView.setText("displayName:");

    showImage(imgUrl:"");s
        }

        public void showResultInfo(AuthHuaweiId huaweiAccount) {

    String displayName = huaweiAccount.getdisplay()
        Log.d(Tag, msg: "avatarUri: "+ avatarUri.toString());

    showImage(avatarUri.toString());
        }

        public void showImage(String imgUrl) {

    Log.d(TAG,  msg: "showImag: "+ imgUrl);

    if (TextUtils.isEmpty(imgUrl)) {
        imgView.setImageResource(R.drawable.ic_launcher_foreground);
    } else {
        imgView.setImageURL(imgUrl);
    }
}


package genetic;
import java.util.ArrayList;
class Thought44 extends Thought{
private static ArrayList<Thought44> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 671.1077055552971;
private double fd1 = 708.383640768985;
private Thought fo0 = null;
private Thought fo1 = null;
Thought44 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought44 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought44 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought44 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought44 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought44 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought44 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought44 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought44 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought44 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought44 instance = new Thought44 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        Thought lo0 = Thought340.getInstance(fd0, fd1, fd0, fd1);
        } else {
        fb0 = fb1 || fb0;
        Thought lo1 = Thought59.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
        Output.points[5][7] -= fd0;
        fd1 *= -1;
        fb1 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = !fb1;
        fb0 = fd0 > fd1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
            fb0 = !fb1;
            fd0 = fd1 - fd0;
            boolean lb2 = false;
if(fo1 != null){
              lb2 = fo1.m2(fb0, fb1, lb2, fb0);
}
            double ld3 = 55.15835746481863;
            fd0 *= -1;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
        fd0 *= -1;
    ab3 = fd1 > fd0;
    boolean lb0 = true;
    Output.points[5][8] += fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    if (ab3) {
        double ld1 = 621.5577481869225;
        Output.points[6][0] -= fd0;
        fd1 *= -1;
if(fo1 != null){
          fo1.m1(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
        double ld2 = 700.480591926464;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    ad4 *= -1;
    double ld1 = 303.64969173398646;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > ld1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    if (lb0) {
        ad3 = ad4 - fd0;
        fb0 = fd1 < ld1;
        Output.points[6][1] += ad1;
if(fo0 != null){
          ad2 = fo0.m3(fb1, lb0, fb0, fb1);
}
        ad3 = ad4 + fd0;
        lb0 = fd1 > ld1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    Thought lo0 = Thought120.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought28.getInstance(ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ab3 = fo0.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Output.points[6][2] -= fd0;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1(lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    Output.points[6][3] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    double ld2 = 256.9594403642656;
    fd0 = fd1 - ld2;
    lb1 = fd0 < fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad1 = ad2 - ad3;
    Output.points[6][4] += ad4;
    if (fb0) {
        } else {
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        fd0 = fd1 - ad1;
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        double ld0 = 9.161409070452153;
        fb1 = fb0 && fb1;
if(ao2 != null){
          ld0 = ao2.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        boolean lb1 = true;
        fd0 = fd1 - ld0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
        fb0 = ad1 < ad2;
        ad3 = ad4 + fd0;
        boolean lb2 = true;
        fb0 = !fb1;
if(ao4 != null){
          ao3 = ao4.m4();
}
        lb1 = !lb2;
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, fb0, fb1, lb1, lb2);
}
        ad4 = fd0 - fd1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    Output.points[6][5] += fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought70.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fd0 > fd1;
    fb1 = ab1 && ab2;
    Thought lo1 = Thought91.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld2 = 746.3919037631325;
    Thought lo3 = Thought317.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    Thought lo4 = Thought246.getInstance();
    fb0 = !fb1;
    ld2 *= -1;
    Thought lo5 = Thought164.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 < ld2;
    Thought lo6 = Thought355.getInstance(fb1, ab1, ab2, ab3);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab4 = ao4.m2(fd0, fd1, ld2, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, ld2, fd0, fd1);
}
    Thought lo7 = Thought378.getInstance(ld2, fd0, fd1, ld2, fb0, fb1, ab1, ab2);
    fd0 *= -1;
    fd1 = ld2 - fd0;
    ab3 = fd1 > ld2;
    fd0 = fd1 - ld2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ad2 *= -1;
if(ao1 != null){
      ao1.m2();
}
    if (ab1) {
        for(int i0=0; i0<10; i0++){
            boolean lb0 = false;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
              ad1 = ao2.m3(fb0, fb1, lb0, ab1);
}
            boolean lb1 = false;
            ab1 = ad2 > ad3;
            ab2 = ab3 || ab4;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
            ad4 *= -1;
            boolean lb2 = false;
if(ao4 != null){
              ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
            ab4 = !fb0;
            ad3 *= -1;
if(fo0 != null){
              fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
            ad2 *= -1;
            }
if(ao4 != null){
          ad3 = ao4.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
        ad2 *= -1;
if(fo0 != null){
          ad3 = fo0.m3();
}
        Output.points[6][6] -= ad4;
        boolean lb3 = false;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        boolean lb4 = true;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 344.47449230498364;
    Thought lo1 = Thought57.getInstance(fb0, fb1, fb0, fb1);
    Thought lo2 = Thought352.getInstance(fo1, fo0, fo1, fo0);
    ld0 = fd0 - fd1;
    fb0 = ld0 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    double ld3 = 919.9789080849456;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0, lb4, fb0, fb1, lb4);
}
    Thought lo5 = Thought233.getInstance(fb0, fb1, lb4, fb0);

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    Thought lo0 = Thought147.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    Output.points[6][7] += fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
    double ld1 = 648.0836119079363;
if(fo0 != null){
      ab3 = fo0.m2(ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    Thought lo2 = Thought315.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = fd0 < fd1;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    ld1 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 > ad2;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    if (fb0) {
        } else {
        fb1 = fb0 || fb1;
        boolean lb0 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
        fb0 = ad4 < fd0;
                Output.points[6][8] += fd1;
        ad1 *= -1;
if(fo0 != null){
          fo0.m3();
}
        Thought lo1 = Thought309.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
        lb0 = fd1 > ad1;
        boolean lb2 = false;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 9.17001619075608;
    ab1 = ad1 < ad2;
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought231.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
    double ld2 = 820.484557943634;
    fb1 = ab1 || ab2;
    for(int i0=0; i0<10; i0++){
        if (ab3) {
            ld0 = ld2 + ad1;
            ad2 *= -1;
if(fo1 != null){
              ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
            ld0 *= -1;
            fb0 = ld2 > ad1;
            ad2 = ad3 - ad4;
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, ld0, ld2, fb1, ab1, ab2, ab3);
}
            ab4 = fb0 || fb1;
            ab1 = ab2 || ab3;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
            double ld3 = 768.288330806676;
}}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb0 = true;
    lb0 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 || fb0;
        fb1 = fd1 > fd0;
if(ao3 != null){
          ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
        Thought lo1 = Thought244.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        boolean lb2 = false;
        fd0 *= -1;
        fd1 = fd0 - fd1;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    Thought lo0 = Thought85.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    ad2 *= -1;
    Thought lo1 = Thought253.getInstance();
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    lb2 = fb0 && fb1;
    fd0 = fd1 + ad1;
if(ao3 != null){
      lb2 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb2, fb0);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb2, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought57.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
    Output.points[7][0] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    double ld1 = 619.5036091472882;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      lb0 = ao1.m2();
}
    ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
    Output.points[7][1] += fd0;
    Thought lo2 = Thought36.getInstance(ao3, ao4, fo0, fo1);
    fd1 = ld1 + fd0;
    fd1 *= -1;
    fb0 = fb1 || lb0;
    Thought lo3 = Thought290.getInstance(ld1, fd0, fd1, ld1);

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ab4 = fb0 || fb1;
    Thought lo0 = Thought214.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    double ld1 = 194.2065780674386;
    Thought lo2 = Thought232.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld1);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought154.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
    boolean lb4 = false;
    ad3 = ad4 - fd0;
    ab1 = !ab2;
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb4);
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    ad3 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
        double ld5 = 644.490207138817;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
        boolean lb6 = true;
        ld5 = ld1 - ad1;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo0 = Thought178.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    boolean lb1 = false;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fd0 *= -1;
    fb0 = !fb1;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo0 = Thought113.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    Thought lo1 = Thought76.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    ab2 = ab3 && ab4;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ab3 = fo0.m2();
}
        }

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb0 = true;
if(fo0 != null){
      ad1 = fo0.m3(lb0, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
    boolean lb1 = true;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = ad1 < ad2;
    boolean lb2 = false;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
    Output.points[7][2] -= ad3;
    Output.points[7][3] -= ad4;
    double ld0 = 837.1224869804581;
    ab2 = ad4 < fd0;
    Output.points[7][4] += fd1;
    ab3 = !ab4;
    ld0 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought49.getInstance();
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ld0;
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[7][5] += ad3;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          ao2.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought328.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb1 = false;
    double ld2 = 871.8623736295308;
    boolean lb3 = true;
    ld2 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld2, fd0, fd1, lb1, lb3, fb0, fb1);
}
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1, lb1, lb3, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3();
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    double ld1 = 447.3303540036976;
    Output.points[7][6] += ad1;
    Thought lo2 = Thought389.getInstance(fb1, lb0, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 - ad4;
    lb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld1, ad1, ad2, ad3);
}
    boolean lb3 = false;
    ad4 *= -1;
    lb3 = fd0 > fd1;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3);
}

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 589.4001150628965;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    Output.points[7][7] -= fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
    double ld1 = 242.71580458707976;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
    ld1 = fd0 - fd1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = ad2 < ad3;
    ad4 = fd0 - fd1;
    double ld0 = 552.7299888470893;
    double ld1 = 1.296544403571339;
    ld0 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought399.getInstance(ld1, ad1, ad2, ad3);
    boolean lb4 = true;
    Thought lo5 = Thought231.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0);
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    ld0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb2, lb4, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2();
}
    ld1 *= -1;
    boolean lb6 = false;
    boolean lb7 = true;
    ad1 *= -1;
    ab1 = ab2 || ab3;
    Thought lo8 = Thought191.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb2);
    lb4 = lb6 && lb7;
    Output.points[7][8] -= fd1;

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(lb0, fb0, fb1, lb0);
}
        Thought lo1 = Thought344.getInstance(fo0, fo1, fo0, fo1);
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        boolean lb2 = true;
        double ld3 = 210.4379353501149;
        lb0 = ld3 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld3, fd0, fb0, fb1, lb2, lb0);
}
        fd1 = ld3 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb0);
}
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo1.m2();
}
            Output.points[8][0] -= fd1;
            }
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, fb0, fb1, lb2, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb2, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 && lb2;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld3, fd0, fd1);
}
        lb0 = ld3 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
}
        fb0 = fb1 && lb2;
if(fo0 != null){
          lb0 = fo0.m2(ld3, fd0, fd1, ld3, fb0, fb1, lb2, lb0);
}
        fb0 = !fb1;
        double ld4 = 832.2335838287013;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = fd1 > fd0;
    ab3 = fd1 < fd0;
    ab4 = fd1 < fd0;
    fb0 = fd1 < fd0;
    boolean lb0 = true;
    Output.points[8][1] += fd1;
    fb0 = fd0 < fd1;
    double ld1 = 396.32344581894307;
    ld1 = fd0 - fd1;
    fb1 = ld1 < fd0;
    double ld2 = 2.051395305501857;
    fd0 *= -1;
    lb0 = ab1 && ab2;
    fd1 *= -1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
    ld1 = ld2 - fd0;
    fb1 = fd1 < ld1;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld1, ld2, lb0, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    ad1 *= -1;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought133.getInstance();
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
    Thought lo3 = Thought255.getInstance(fb0, fb1, lb0, lb2);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    ab3 = ad4 > fd0;
    ab4 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || ab1;
    Thought lo0 = Thought182.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    double ld1 = 609.030646105214;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld1 = ad1 - ad2;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo1.m2();
}
        fb0 = fb1 && ab1;
        ab2 = ab3 || ab4;
        ad3 = ad4 - fd0;
        if (fb0) {
            double ld2 = 270.9897100114804;
if(fo0 != null){
              fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, ld1, ad1, fb1, ab1, ab2, ab3);
}
            Output.points[8][2] += ad2;
if(fo1 != null){
              fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
              ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
              fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld1, ad1, ad2);
}
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      fb0 = ao3.m2();
}
    Output.points[8][3] -= fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    fd1 *= -1;
if(ao3 != null){
      lb0 = ao3.m2(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    double ld2 = 290.7554022126642;
    fb0 = fb1 && lb0;
    Output.points[8][4] += ld2;
    lb1 = fd0 > fd1;
    fb0 = ld2 < fd0;
    Output.points[8][5] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ld2, fd0, fd1, ld2);
}
    boolean lb3 = true;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2, fb1, lb0, lb1, lb3);
}

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        ad2 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        ad3 = ad4 - fd0;
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
        fd1 *= -1;
        boolean lb0 = true;
if(ao2 != null){
          ao2.m3();
}
        Thought lo1 = Thought383.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
        fb1 = fd0 < fd1;
        ad1 *= -1;
if(ao1 != null){
          ad2 = ao1.m3(lb0, fb0, fb1, lb0);
}
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 700.4786263508719;
    Output.points[8][6] -= ld0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = fd0 > fd1;
    boolean lb1 = true;
    ld0 = fd0 - fd1;
    Thought lo2 = Thought21.getInstance(ld0, fd0, fd1, ld0);
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, lb3, ab1);
}

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    ab1 = ad4 < fd0;
if(ao1 != null){
      ab2 = ao1.m2();
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought362.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
        Output.points[8][7] += ad4;
        lb0 = fd0 > fd1;
        ad1 = ad2 - ad3;
        boolean lb2 = false;
        Output.points[8][8] -= ad4;
if(fo1 != null){
          fo1.m3(lb0, ab1, ab2, ab3);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Output.points[0][0] -= fd0;
        ab4 = fb0 || fb1;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
        Thought lo3 = Thought144.getInstance(ad2, ad3, ad4, fd0, lb2, lb0, ab1, ab2);
        }
    ab4 = fb0 && fb1;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 161.2684476687283;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - ld0;
    double ld2 = 800.8751554201102;
    fb0 = !fb1;
    lb1 = ld2 < fd0;
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
    fb0 = fd1 < ld0;
    double ld3 = 619.0102036574152;
    fb1 = ld2 > ld3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld0;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1, lb1, lb4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought138.getInstance(ld0, ld2, ld3, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld2, ld3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld2, lb1, lb4, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      lb4 = fo0.m2(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld0, fb0, fb1, lb1, lb4);
}
    Thought lo6 = Thought271.getInstance(fb0, fb1, lb1, lb4);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought106.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought8.getInstance(fd0, fd1, fd0, fd1);
    Thought lo3 = Thought320.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, lb4, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2();
}
    lb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][1] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    Output.points[0][2] -= fd1;
    double ld0 = 741.8396858482495;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = fd1 > ld0;
    fd0 = fd1 + ld0;
    fd0 *= -1;
    fb0 = fd1 < ld0;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > ld0;
    Thought lo2 = Thought56.getInstance(fd0, fd1, ld0, fd0);
    lb1 = !fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}

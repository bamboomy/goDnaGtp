package genetic;
import java.util.ArrayList;
class Thought24 extends Thought{
private static ArrayList<Thought24> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 271.761668866276;
private double fd1 = 879.1100210395143;
private Thought fo0 = null;
private Thought fo1 = null;
Thought24 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought24 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought24 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought24 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought24 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1();
}
    Thought lo1 = Thought190.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld2 = 298.3193924525819;
if(fo0 != null){
      fo0.m3(ld2, fd0, fd1, ld2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 - fd0;
if(fo0 != null){
      lb0 = fo0.m2(fd1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd0 > fd1;
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    Output.points[3][0] -= fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
        boolean lb2 = true;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought201.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    Output.points[3][1] += fd0;
    ab3 = ab4 && fb0;

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
    fb0 = ad2 < ad3;
    ad4 *= -1;
    fb1 = fb0 || fb1;
    double ld0 = 420.29342932579306;
    fb0 = fb1 && fb0;
    fb1 = ad4 > fd0;
    fb0 = fb1 && fb0;
    Output.points[3][2] -= fd1;
    fb1 = fb0 && fb1;
    ld0 *= -1;
    ad1 *= -1;
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    double ld1 = 969.5940786505333;
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            for(int i2=0; i2<10; i2++){
                fd0 *= -1;
                Thought lo4 = Thought286.getInstance(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb2);
                fd1 *= -1;
if(fo1 != null){
                  fo0 = fo1.m4();
}
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2, lb3, fb0, fb1, lb2);
}
if(fo0 != null){
                  fo0.m2(lb3, fb0, fb1, lb2);
}
                Output.points[3][3] -= ad3;
}}}
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
    ab2 = ad2 > ad3;
    double ld0 = 94.38437631572836;
    Thought lo1 = Thought80.getInstance(fo1, fo0, fo1, fo0);
        boolean lb2 = true;
    boolean lb3 = true;
    ab1 = ab2 && ab3;
    ad3 = ad4 - fd0;
    ab4 = fb0 || fb1;
    fd1 = ld0 + ad1;
    lb2 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ld0 + ad1;
    double ld4 = 437.2268199069768;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, ld0, ld4, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
    double ld5 = 566.8664894816104;
    ad3 = ad4 - fd0;
    fd1 = ld0 - ld4;
    boolean lb6 = true;
    fb0 = fb1 || lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb6, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld0 = 144.80755663018925;
    Thought lo1 = Thought20.getInstance(ao2, ao3, ao4, fo0);
    Output.points[3][4] += ld0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    Thought lo2 = Thought196.getInstance(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = ld0 > fd0;
    fb1 = fd1 < ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
    boolean lb3 = true;
    boolean lb4 = false;
    Thought lo5 = Thought379.getInstance(lb3, lb4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao4.m2(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    double ld1 = 954.1524530230076;
    Thought lo2 = Thought377.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
    double ld3 = 738.9665145689278;
    boolean lb4 = false;
    ad4 *= -1;
    fb0 = fd0 > fd1;
    fb1 = ld1 < ld3;
    Thought lo5 = Thought316.getInstance();
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb0, lb4, fb0, fb1);
}
    if (lb0) {
        Thought lo6 = Thought42.getInstance(lb4, fb0, fb1, lb0);
        lb4 = fb0 || fb1;
        for(int i0=0; i0<10; i0++){
            Thought lo7 = Thought372.getInstance(ao2, ao3, ao4, fo0);
            Output.points[3][5] -= fd1;
            ld1 = ld3 - ad1;
            ad2 = ad3 + ad4;
            lb0 = fd0 < fd1;
if(ao1 != null){
              fo1 = ao1.m4(ld1, ld3, ad1, ad2);
}
if(ao2 != null){
              ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        Output.points[3][6] -= fd0;
if(ao1 != null){
          ao1.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        boolean lb0 = true;
        if (lb0) {
            Output.points[3][7] -= fd1;
            boolean lb1 = true;
            Thought lo2 = Thought148.getInstance(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
            ab4 = fd0 < fd1;
            fb0 = fb1 || lb1;
            lb0 = !ab1;
            ab2 = fd0 < fd1;
            ab3 = !ab4;
            fd0 = fd1 - fd0;
            double ld3 = 865.9334813359342;
            for(int i0=0; i0<10; i0++){
                fb0 = !fb1;
if(ao1 != null){
                  fo1 = ao1.m4();
}
if(ao2 != null){
                  ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld3, fd0, lb1, lb0, ab1, ab2);
}
if(ao1 != null){
                  ab3 = ao1.m2(ab4, fb0, fb1, lb1);
}
                }
            lb0 = fd1 > ld3;
            ab1 = fd0 < fd1;
if(ao2 != null){
              ld3 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
              ab2 = ao1.m2(fd0, fd1, ld3, fd0);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    lb1 = ab1 || ab2;
    ab3 = !ab4;
    Output.points[3][8] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, lb0, lb1, ab1, ab2);
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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 465.55426081088405;
    Output.points[4][0] += fd0;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = !fb0;
    boolean lb1 = true;
    fb0 = fd1 > ld0;
    fb1 = lb1 && fb0;
    Output.points[4][1] += fd0;
    boolean lb2 = false;
    fd1 = ld0 - fd0;
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fo1.m2(fb1, lb1, lb2, fb0);
}
    double ld3 = 141.62262426975047;
    double ld4 = 564.6952549828077;
    Thought lo5 = Thought326.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !lb1;
    double ld6 = 964.4268636563372;
if(fo1 != null){
          fo0 = fo1.m4(ld4, ld6, fd0, fd1);
}
    boolean lb7 = true;
    Thought lo8 = Thought225.getInstance(fo0, fo1, fo0, fo1, ld0, ld3, ld4, ld6);
    lb2 = !lb7;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ld3, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb7, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
return lb2;
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
    ab1 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, ab1, ab2);
}
    boolean lb1 = true;
    ab2 = ab3 || ab4;
    double ld2 = 438.498413065516;
    boolean lb3 = false;
    fd0 = fd1 - ld2;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
    fd1 = ld2 + fd0;
    if (ab4) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
if(fo0 != null){
          ld2 = fo0.m3(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
        lb3 = ab1 && ab2;
        ab3 = fd1 < ld2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
        boolean lb4 = false;
        lb0 = lb1 || lb3;
if(fo1 != null){
          fo1.m1();
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought200.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (fb0) {
        fb1 = ad1 < ad2;
        fb0 = ad3 < ad4;
if(fo1 != null){
          fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        fb1 = ad2 > ad3;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
        ad2 = ad3 - ad4;
        Output.points[4][2] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
        fb1 = fd1 > ad1;
        lb1 = !fb0;
        } else {
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad2 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ad1 = ad2 + ad3;
        ad4 = fd0 - fd1;
        Thought lo2 = Thought244.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought56.getInstance();
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought157.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = ab1 && ab2;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}

Thought.STACK_COUNTER++;
return ab3;
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
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb1, fb0);
}
    double ld2 = 465.8497707088865;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo3 = Thought66.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
    fd0 *= -1;
    fb1 = !lb0;
    fd1 = ld2 + fd0;

Thought.STACK_COUNTER++;
return lb1;
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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 *= -1;
    Thought lo1 = Thought52.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
    Thought lo2 = Thought258.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    boolean lb3 = false;
    ad2 = ad3 + ad4;
    Thought lo4 = Thought383.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb3);
    fb0 = fb1 || lb0;
    boolean lb5 = false;
    lb3 = fd0 < fd1;
    lb5 = ad1 < ad2;
    fb0 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb6 = true;
    fd0 *= -1;
    fb0 = !fb1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, lb0, lb3, lb5, lb6);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb3);
}
    Output.points[4][3] -= ad4;

Thought.STACK_COUNTER++;
return lb5;
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
    fd0 *= -1;
    ab2 = ab3 && ab4;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought63.getInstance(ao1, ao2, ao3, ao4);
    fb0 = fb1 && ab1;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 > fd0;
if(fo1 != null){
      ab4 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought31.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    Thought lo3 = Thought349.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, lb2, ab1);
}
    double ld4 = 675.632070720732;
    ld4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    ab4 = fd0 < fd1;
    fb0 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4();
}
    ab2 = !ab3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    fd0 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
        fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    Thought lo1 = Thought153.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;

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
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought213.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo0.m1();
}
        for(int i1=0; i1<10; i1++){
            fb0 = fb1 || fb0;
            Output.points[4][4] -= fd0;
            Thought lo1 = Thought282.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
            ad4 = fd0 - fd1;
            double ld2 = 729.2462805083858;
if(fo1 != null){
              ld2 = fo1.m3(fb1, fb0, fb1, fb0);
}
            if (fb1) {
                if (fb0) {
if(fo0 != null){
                      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
                    Thought lo3 = Thought371.getInstance(ad1, ad2, ad3, ad4);
                    fd0 = fd1 + ld2;
                    fb0 = !fb1;
                    } else {
                    fb0 = ad1 < ad2;
if(fo0 != null){
                      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
                      fo1 = fo0.m4(ld2, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
}}}}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ad4 > fd0;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
    fb0 = !fb1;
    double ld1 = 359.7360250491265;
    Output.points[4][5] += ad1;
    boolean lb2 = true;
        Thought lo3 = Thought185.getInstance(lb0, lb2, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought184.getInstance(ad2, ad3, ad4, fd0);
    Thought lo5 = Thought320.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);

Thought.STACK_COUNTER++;
return ad3;
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
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        } else {
        fb1 = fd0 < fd1;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + fd0;
        Thought lo0 = Thought263.getInstance();
        fb1 = fd1 < fd0;
        Thought lo1 = Thought362.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo0.m2(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Thought lo2 = Thought348.getInstance(fd1, fd0, fd1, fd0);
        fb0 = fb1 && fb0;
        double ld3 = 971.6966122658919;
        fd0 = fd1 - ld3;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld3, fd0, fd1);
}
if(fo0 != null){
          fb1 = fo0.m2(ld3, fd0, fd1, ld3, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - ld3;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
        for(int i0=0; i0<10; i0++){
            fb1 = fb0 && fb1;
            boolean lb4 = false;
            lb4 = !fb0;
            fb1 = lb4 || fb0;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 = ad2 - ad3;
    double ld0 = 132.68232586221185;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    ad3 *= -1;
    Thought lo1 = Thought397.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    boolean lb2 = false;
    ad1 = ad2 + ad3;
    fb0 = fb1 || lb2;
    Output.points[4][6] += ad4;
    fd0 = fd1 - ld0;
    Thought lo3 = Thought283.getInstance(fb0, fb1, lb2, fb0);
    boolean lb4 = true;
    boolean lb5 = true;
    lb5 = ad1 < ad2;
    double ld6 = 34.05812153788677;
    Thought lo7 = Thought376.getInstance(ao1, ao2, ao3, ao4);
    boolean lb8 = true;
    lb8 = fb0 && fb1;
    Output.points[4][7] -= ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    lb2 = ld0 < ld6;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    double ld9 = 479.0956968926469;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
    lb4 = ld6 < ld9;

Thought.STACK_COUNTER++;
return ad1;
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
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought224.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
if(ao2 != null){
      ab1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, lb1, lb2);
}
    ab1 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab2 = ao4.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    boolean lb4 = false;
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo6 = Thought376.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb3, lb4, lb5, ab1);
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb7 = true;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    Thought lo3 = Thought70.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1, lb1, lb2, ab1, ab2);
}
    ab3 = ad2 < ad3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      lb2 = ao1.m2();
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
        boolean lb4 = true;
    boolean lb5 = false;
if(ao1 != null){
      ad2 = ao1.m3(ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[4][8] -= ad2;
    lb0 = ad3 < ad4;
    lb1 = !lb2;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    Thought lo6 = Thought343.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    lb4 = !lb5;
    Output.points[5][0] += ad1;
    ad2 *= -1;
    ab1 = ab2 && ab3;
    ad3 *= -1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[5][1] += fd0;
    Output.points[5][2] += fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    double ld0 = 236.55226929391844;
    double ld1 = 211.7531474216303;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld2 = 860.4793570333422;
    double ld3 = 729.1984107275522;
    Output.points[5][3] += ld1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ld2 > ld3;
    Thought lo4 = Thought44.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);
}
    ld0 = ld1 + ld2;
if(fo1 != null){
      fb1 = fo1.m2(ld3, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ld1 *= -1;
    fb0 = fb1 && fb0;
    double ld5 = 525.3639758984575;
if(fo0 != null){
      ld2 = fo0.m3();
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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    Output.points[5][4] += fd0;
    fd1 *= -1;
    Output.points[5][5] += fd0;
    Output.points[5][6] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    Output.points[5][7] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    boolean lb0 = true;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    ad4 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3();
}
    Thought lo2 = Thought294.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
    lb1 = fb0 && fb1;
if(fo1 != null){
      ad3 = fo1.m3(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb1 = fo1.m2(ad4, fd0, fd1, ad1);
}
    if (fb0) {
        Output.points[5][8] += ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        for(int i0=0; i0<10; i0++){
            Thought lo3 = Thought173.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
            fb1 = lb0 && lb1;
            fb0 = fb1 || lb0;
            boolean lb4 = false;
            Thought lo5 = Thought253.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
            Thought lo6 = Thought305.getInstance();
            Thought lo7 = Thought5.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb4, lb0, lb1, fb0);
            fb1 = lb4 && lb0;
            Thought lo8 = Thought325.getInstance(lb1, fb0, fb1, lb4);
}}
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
    ab2 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    Output.points[6][0] += ad2;
    Thought lo0 = Thought316.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought371.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought249.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 - fd0;
    double ld1 = 40.2760411935369;
    fb1 = fd0 > fd1;
    ld1 *= -1;
    Thought lo2 = Thought171.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    boolean lb3 = true;
    fd0 *= -1;
    Thought lo4 = Thought314.getInstance(fo1, ao1, ao2, ao3);
    boolean lb5 = false;
if(ao4 != null){
      fd1 = ao4.m3(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
    fd0 = fd1 - ld1;
    double ld6 = 549.3155152870625;
    ld6 *= -1;
    lb5 = fd0 > fd1;
if(ao4 != null){
      ld1 = ao4.m3(ld6, fd0, fd1, ld1, fb0, fb1, lb3, lb5);
}
    fb0 = fb1 || lb3;
if(fo0 != null){
      lb5 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb3, lb5);
}
    double ld7 = 861.7754348020416;
    fb0 = fb1 && lb3;
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb8 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld6, ld7, fd0, fd1, lb5, lb8, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Output.points[6][1] -= ad1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    Thought lo0 = Thought282.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought82.getInstance();
    ad3 = ad4 + fd0;
    fb0 = !fb1;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb2);
}
    ad4 *= -1;
    Output.points[6][2] -= fd0;
    fd1 *= -1;
    if (fb0) {
        Thought lo3 = Thought282.getInstance(fb1, lb2, fb0, fb1);
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
        boolean lb4 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
        Thought lo5 = Thought389.getInstance(ad3, ad4, fd0, fd1, lb4, lb2, fb0, fb1);
        boolean lb6 = false;
        lb4 = ad1 > ad2;
}
Thought.STACK_COUNTER++;
return ao4;
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
    Output.points[6][3] -= fd0;
    double ld0 = 851.0827197920579;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    Output.points[6][4] += fd0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    if (ab1) {
        fd1 *= -1;
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
        lb1 = !ab1;
        ab2 = ab3 || ab4;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb1, ab1);
}
        fd0 *= -1;
        double ld2 = 665.2317728538153;
        boolean lb3 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ab1 = ao4.m2(fd0, fd1, ld2, ld0);
}
        ab2 = ab3 && ab4;
        fb0 = fd0 > fd1;
        fb1 = ld2 < ld0;
        Thought lo4 = Thought358.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ld0);
        fd0 *= -1;
        fd1 *= -1;
        ld2 *= -1;
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    double ld1 = 71.63988131391528;
    ab2 = ab3 && ab4;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb0, ab1);
}
        ad2 *= -1;
    ad3 = ad4 + fd0;
    fd1 = ld1 - ad1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb2 = false;
    ab1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ld1 = ad1 + ad2;
    ab2 = ab3 && ab4;
if(fo0 != null){
          ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
    Output.points[6][5] += ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[6][6] += fd1;
    fd0 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd1 *= -1;
    boolean lb1 = true;
    boolean lb2 = false;
    Thought lo3 = Thought207.getInstance();
    Thought lo4 = Thought345.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, lb2, fb0);
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo5 = Thought123.getInstance(fb1, lb0, lb1, lb2);
    double ld6 = 2.012706928605639;
    boolean lb7 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld6, fd0);
}
    lb7 = fb0 || fb1;
    lb0 = lb1 && lb2;
    fd1 = ld6 - fd0;
    fd1 *= -1;
    Thought lo8 = Thought306.getInstance(fo1, fo0, fo1, fo0, ld6, fd0, fd1, ld6);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld6, fd0, lb7, fb0, fb1, lb0);
}
    fd1 *= -1;

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    double ld0 = 959.3556272874147;
    double ld1 = 879.6797347847014;
    double ld2 = 532.4126562975068;
    fb0 = fb1 || fb0;
    fb1 = ld1 > ld2;
    boolean lb3 = false;
    lb3 = fd0 > fd1;
if(fo0 != null){
      ld0 = fo0.m3();
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
        fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Output.points[6][7] -= fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought174.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    double ld2 = 490.1274203115226;
    Output.points[6][8] -= fd0;
    fb0 = !fb1;
    lb1 = fd1 > ld2;

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

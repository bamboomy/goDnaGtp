package genetic;
import java.util.ArrayList;
class Thought39 extends Thought{
private static ArrayList<Thought39> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 600.223542705851;
private double fd1 = 871.2745386519365;
private Thought fo0 = null;
private Thought fo1 = null;
Thought39 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought39 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought39 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought39 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought39 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought39 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought39 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought39 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought39 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought39 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought39 instance = new Thought39 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    Output.points[8][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 376.52697593748854;
    fb0 = fd0 > fd1;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld3 = 560.113788385931;
    fb0 = ld0 < ld3;
    fd0 = fd1 + ld0;
    fb1 = lb1 || lb2;
    fb0 = ld3 < fd0;

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
        for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        ab2 = fd0 > fd1;
        double ld0 = 89.23011318067597;
        ab3 = ab4 || fb0;
        for(int i1=0; i1<10; i1++){
            boolean lb1 = true;
if(fo0 != null){
              ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
            boolean lb2 = false;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 *= -1;
    Thought lo1 = Thought378.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
        double ld2 = 71.6992889489614;
    fd0 *= -1;
    fd1 *= -1;
    ld2 = ad1 + ad2;
    fb1 = !lb0;
    ad3 = ad4 + fd0;
    fb0 = fd1 < ld2;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought190.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    lb0 = fb0 && fb1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ab2 = ad4 > fd0;
    Output.points[8][1] -= fd1;
    ab3 = !ab4;
    ad1 = ad2 - ad3;
    Output.points[8][2] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[8][3] -= ad1;
    boolean lb0 = false;
    double ld1 = 687.9448695801266;
    double ld2 = 852.1428491639814;
    double ld3 = 142.82769541486616;
    boolean lb4 = true;
    ld2 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 295.04281698274235;
    Thought lo1 = Thought153.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    fd0 *= -1;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought338.getInstance(lb2, fb0, fb1, lb2);
    boolean lb4 = true;
    boolean lb5 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ld0 *= -1;
    fd0 = fd1 + ld0;
    double ld6 = 321.2760804731169;
    Thought lo7 = Thought142.getInstance(ld6, fd0, fd1, ld0);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld6, fd0, fd1, ld0);
}
if(fo1 != null){
      lb4 = fo1.m2(ld6, fd0, fd1, ld0, lb5, fb0, fb1, lb2);
}
    lb4 = !lb5;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb2, lb4, lb5);
}
    double ld8 = 759.7333840498418;
    fb0 = !fb1;
    lb2 = !lb4;
    Output.points[8][4] += ld6;
    boolean lb9 = true;
    lb5 = ld8 > fd0;
    fd1 = ld0 + ld6;
    ld8 *= -1;
    fd0 = fd1 + ld0;
    Output.points[8][5] -= ld6;

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
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
        boolean lb1 = false;
        double ld2 = 836.4861474883562;
if(ao3 != null){
          fb0 = ao3.m2(fb1, lb1, lb0, fb0);
}
        ad4 = fd0 - fd1;
        double ld3 = 16.765009278670796;
        fb1 = ld2 < ld3;
        ad1 *= -1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        lb1 = ad2 < ad3;
        boolean lb4 = false;
        lb4 = ad4 > fd0;
        if (lb0) {
            Thought lo5 = Thought373.getInstance(fd1, ld2, ld3, ad1);
            fb0 = fb1 || lb1;
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
    ab2 = fd1 > fd0;
    boolean lb0 = true;
    double ld1 = 27.405899354486873;
    fd0 = fd1 + ld1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
    ab2 = ld1 < fd0;
if(fo1 != null){
          fd1 = fo1.m3(ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 *= -1;
    ld1 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        fd0 = fd1 - ld1;
        Thought lo3 = Thought309.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
        lb2 = fd1 < ld1;
if(ao2 != null){
          ao1 = ao2.m4(lb0, ab1, ab2, ab3);
}
        boolean lb4 = false;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 < fd1;
    if (ab3) {
        ab4 = ad1 > ad2;
if(ao1 != null){
          ad3 = ao1.m3(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
        ad2 *= -1;
if(ao2 != null){
          ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
        Thought lo0 = Thought131.getInstance();
        ab2 = ad3 > ad4;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        Output.points[8][6] -= ad3;
        ad4 *= -1;
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
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought320.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought31.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought263.getInstance();
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[8][7] -= fd1;
if(fo1 != null){
      fo1.m2();
}
    boolean lb3 = true;
    double ld4 = 553.1077660229585;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4, lb2, lb3, ab1, ab2);
}
    double ld5 = 972.6534791254448;
    double ld6 = 824.7685245553848;
    boolean lb7 = true;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld5 = ld6 + fd0;

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
    ad1 *= -1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
        double ld0 = 968.5415826500807;
    fb1 = fb0 || fb1;
    fd0 = fd1 + ld0;
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    Thought lo1 = Thought392.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
    fb1 = fb0 && fb1;
    fb0 = ad3 > ad4;
    fb1 = fd0 > fd1;
    Thought lo2 = Thought257.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = ad4 > fd0;
    Thought lo3 = Thought238.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1();
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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought346.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
    fb1 = ad1 > ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ad2 > ad3;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[8][8] += ad4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    double ld0 = 281.27464582915655;
    fb1 = ld0 > fd0;
    fb0 = fd1 > ld0;
    Output.points[0][0] -= fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fd0 < fd1;
    double ld1 = 537.3071285467045;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = !fb1;
if(ao4 != null){
      ao4.m3(lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    fb0 = fb1 && lb2;
    ld0 = ld1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fb0 = fo0.m2(fd1, ld0, ld1, fd0);
}
    fb1 = lb2 || fb0;
    fd1 *= -1;
    fb1 = lb2 && fb0;
    Output.points[0][1] += ld0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 340.0101704146256;
    fb0 = ad1 < ad2;
    Output.points[0][2] += ad3;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
    Output.points[0][3] -= ad1;
    double ld1 = 439.4862302219029;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, ld1, ad1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 - ad4;
    double ld2 = 345.06397895103686;

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
        double ld0 = 589.6406338115141;
    ab1 = ld0 > fd0;
if(ao2 != null){
      ao2.m1(fd1, ld0, fd0, fd1);
}
    if (ab2) {
        double ld1 = 963.3754103831291;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ld1, ld0, fd0, fd1);
}
        boolean lb2 = true;
        ab2 = !ab3;
if(ao3 != null){
          ao2 = ao3.m4(ld1, ld0, fd0, fd1, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        ld1 = ld0 + fd0;
        Output.points[0][4] -= fd1;
        double ld3 = 577.358043365651;
        ld1 = ld3 + ld0;
        fb0 = fb1 && lb2;
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
    if (ab1) {
        ab2 = ad1 > ad2;
if(ao2 != null){
          ab3 = ao2.m2();
}
        ad3 *= -1;
        ab4 = ad4 > fd0;
        fd1 = ad1 - ad2;
        double ld0 = 426.508444599843;
        boolean lb1 = false;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
        fd1 = ld0 + ad1;
        ad2 = ad3 + ad4;
        boolean lb2 = false;
if(ao3 != null){
          ao2 = ao3.m4(lb2, ab1, ab2, ab3);
}
        ab4 = fd0 < fd1;
        ld0 = ad1 - ad2;
        Thought lo3 = Thought31.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
        boolean lb4 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3);
}
        ab4 = fb0 || fb1;
if(ao4 != null){
          ao4.m3(ad4, fd0, fd1, ld0, lb1, lb2, lb4, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
    Output.points[0][5] -= fd0;

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
        boolean lb0 = true;
    double ld1 = 286.4691363911243;
    ab1 = ab2 && ab3;
    ab4 = ld1 > fd0;
    fb0 = !fb1;
    double ld2 = 588.7489805399321;
    lb0 = fd0 < fd1;
    boolean lb3 = true;
    boolean lb4 = true;
    lb3 = ld1 > ld2;
    Output.points[0][6] += fd0;
    fd1 = ld1 + ld2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb4, ab1, ab2, ab3);
}
    ab4 = !fb0;
    Output.points[0][7] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld1, ld2, fd0, fb1, lb0, lb3, lb4);
}
    fd1 = ld1 - ld2;
    fd0 = fd1 - ld1;
if(fo0 != null){
      ld2 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld1, ld2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    Output.points[0][8] += ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 > fd0;
    fd1 = ad1 - ad2;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    Thought lo1 = Thought241.getInstance(fb1, lb0, fb0, fb1);
    ad1 *= -1;
    boolean lb2 = true;
    lb0 = lb2 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 93.10336982431166;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    double ld0 = 66.500045544289;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4();
}
    boolean lb1 = true;
    Output.points[1][0] -= ad1;

Thought.STACK_COUNTER++;
return ad2;
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
    fd1 *= -1;
    fb1 = fb0 || fb1;
    double ld0 = 705.0638957663591;
    ld0 = fd0 - fd1;
    boolean lb1 = true;
    lb1 = ld0 < fd0;
    fb0 = fd1 > ld0;
    double ld2 = 256.59081270472905;
    Thought lo3 = Thought270.getInstance(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
    boolean lb4 = false;
    lb1 = lb4 && fb0;
    fb1 = ld2 > fd0;
    lb1 = lb4 && fb0;
    boolean lb5 = true;
    double ld6 = 385.2567448184537;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo0.m2(lb4, lb5, fb0, fb1);
}
    lb1 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4);
}

Thought.STACK_COUNTER++;
return ld2;
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
    fb1 = fb0 && fb1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    lb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought253.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    fb0 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought68.getInstance();
    fb0 = ad4 < fd0;
    boolean lb3 = true;
    fb0 = fb1 || lb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, lb3, fb0, fb1, lb0);
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
    ab2 = ab3 && ab4;
    fd0 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ab4 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought236.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    double ld1 = 378.5295000032568;
        Output.points[1][1] += fd0;
    ab1 = ab2 || ab3;
    double ld2 = 613.0690724098692;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, ld2, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad2 *= -1;
    if (ab4) {
        fb0 = ad3 > ad4;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
        double ld0 = 679.6004641486271;
        ab4 = ad2 > ad3;
        fb0 = ad4 < fd0;
        double ld1 = 954.7511047759353;
if(ao3 != null){
          fd0 = ao3.m3(fb1, ab1, ab2, ab3);
}
        boolean lb2 = true;
        ab3 = ab4 && fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(fd1, ld0, ld1, ad1);
}
        Thought lo3 = Thought179.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
        boolean lb4 = false;
        fd1 = ld0 + ld1;
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    Output.points[1][2] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 846.6492980617755;
    fd0 = fd1 + ld0;
    boolean lb1 = false;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2();
}
    Thought lo2 = Thought386.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);

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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fd0 = fd1 - fd0;
        boolean lb0 = true;
        fb0 = fd1 < fd0;
        double ld1 = 163.10699111869576;
        Output.points[1][3] += fd0;
        fd1 *= -1;
        fb1 = lb0 || ab1;
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = lb0 && ab1;
if(fo1 != null){
          fd0 = fo1.m3();
}
        fd1 = ld1 - fd0;
        ab2 = ab3 || ab4;
        boolean lb2 = true;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
        Thought lo3 = Thought224.getInstance(lb2, ab1, ab2, ab3);
        Thought lo4 = Thought254.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought27.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    fb1 = fb0 && fb1;
    fd1 = ad1 - ad2;
    double ld1 = 111.85099849398168;
    double ld2 = 254.28506232635596;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld3 = 630.7938596651371;
if(fo1 != null){
      fo1.m3();
}
    fb1 = fb0 || fb1;
    ld3 *= -1;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ld1 = ld2 - ld3;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
    if (fb0) {
        Thought lo4 = Thought280.getInstance(fo1, fo0, fo1, fo0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
        }
    ab2 = ad1 > ad2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[1][4] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < ad1;
    ab2 = ad2 > ad3;

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
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    fd0 *= -1;
    if (fb0) {
        fd1 *= -1;
        Output.points[1][5] -= fd0;
        double ld0 = 521.5235400241193;
        fb1 = fb0 || fb1;
        Thought lo1 = Thought184.getInstance();
        fb0 = !fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = ld0 - fd0;
        boolean lb2 = true;
        Output.points[1][6] += fd1;
        lb2 = fb0 || fb1;
        lb2 = ld0 < fd0;
        Thought lo3 = Thought368.getInstance(fb0, fb1, lb2, fb0);
        boolean lb4 = false;
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
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    Output.points[1][7] -= ad1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb1 = ao1.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    lb0 = ad1 < ad2;
    Output.points[1][8] += ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fd1 = ad1 + ad2;
    boolean lb1 = false;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao2.m3();
}
    fd1 = ad1 + ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4(lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought111.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    ab1 = fd0 > fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    fd1 *= -1;
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        if (fb0) {
if(ao1 != null){
              fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
            ab4 = !fb0;
            double ld0 = 363.6926990002434;
            Output.points[2][0] += ld0;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
            } else if (ab4) {
            fb0 = fd1 < fd0;
            fb1 = fd1 > fd0;
            fd1 = fd0 - fd1;
if(ao2 != null){
              ab1 = ao2.m2();
}
            Thought lo1 = Thought344.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao1 != null){
              fd0 = ao1.m3(fb1, ab1, ab2, ab3);
}
}}
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
    ab2 = ab3 || ab4;
    double ld0 = 180.2476483803491;
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = false;
    Output.points[2][1] -= ad1;
    Output.points[2][2] -= ad2;
    ab2 = !ab3;
    if (ab4) {
        ad3 = ad4 + fd0;
        Thought lo4 = Thought117.getInstance(ao1, ao2, ao3, ao4);
        fb0 = fd1 > ld0;
        Thought lo5 = Thought259.getInstance(ad1, ad2, ad3, ad4);
        fb1 = lb1 || lb2;
        lb3 = !ab1;
        ab2 = !ab3;
        } else {
                ab4 = !fb0;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2);
}
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
    Output.points[2][3] += fd1;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    Output.points[2][4] -= fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    double ld2 = 579.1775662065248;
    lb1 = fb0 && fb1;
    lb0 = fd0 > fd1;
    ld2 = fd0 - fd1;
    double ld3 = 934.3168267320732;
if(fo1 != null){
      ld2 = fo1.m3();
}
    lb1 = ld3 > fd0;
    fb0 = fd1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
    fb1 = ld3 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[2][5] -= fd0;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    Thought lo0 = Thought377.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;

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
    fb1 = fb0 || fb1;
    Thought lo0 = Thought165.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 544.0712908094603;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb1, fb0, fb1);
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3(lb1, lb3, fb0, fb1);
}
    lb1 = fd1 > ld2;
    double ld4 = 662.3427478702733;

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

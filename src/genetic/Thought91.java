package genetic;
import java.util.ArrayList;
class Thought91 extends Thought{
private static ArrayList<Thought91> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 195.8521082797534;
private double fd1 = 846.4403227000944;
private Thought fo0 = null;
private Thought fo1 = null;
Thought91 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought91 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought91 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought91 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought91 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought91 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought91 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought91 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought91 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought91 instance = new Thought91 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought91 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought91 instance = new Thought91 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought91 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought91 instance = new Thought91 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought91 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought91 instance = new Thought91 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought91 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought91 instance = new Thought91 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought91 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought91 instance = new Thought91 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought91 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought91 instance = new Thought91 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought91 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought91 instance = new Thought91 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
        fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought10.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    double ld1 = 958.5702757342178;
if(fo1 != null){
      fb0 = fo1.m2();
}
    ld1 = fd0 + fd1;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought66.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
    double ld1 = 703.2055842116476;
    ld1 = fd0 - fd1;
    Output.points[6][3] -= ld1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought13.getInstance(fd0, fd1, ld1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    double ld3 = 347.9154004067692;
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    ld1 = ld3 - fd0;
    fd1 = ld1 - ld3;
    ab4 = !fb0;
    Output.points[6][4] -= fd0;

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
          fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = !fb1;
    Thought lo0 = Thought10.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 && fb0;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    if (fb1) {
        Thought lo2 = Thought29.getInstance(fd1, ad1, ad2, ad3);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        double ld3 = 918.6256514950928;
if(fo1 != null){
          lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
        } else if (fb1) {
        double ld4 = 886.3839032431499;
        lb1 = ad1 < ad2;
if(fo0 != null){
          fb0 = fo0.m2();
}
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ld4, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        if (fb0) {
            } else if (fb1) {
            lb1 = ad1 > ad2;
            fb0 = ad3 < ad4;
            fd0 *= -1;
            Output.points[6][5] -= fd1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 201.85407238871557;
    Output.points[6][6] -= ld0;
    ab1 = ad1 > ad2;
    ab2 = ad3 < ad4;
    ab3 = ab4 || fb0;
    Output.points[6][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      ad1 = fo0.m3(fb1, lb1, ab1, ab2);
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
      fd0 = ao2.m3();
}
    if (fb1) {
if(ao3 != null){
          ao3.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fd1 = fd0 - fd1;
        fd0 *= -1;
        fd1 *= -1;
        fb0 = fb1 && fb0;
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 && fb0;
if(ao2 != null){
          fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought40.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
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
    fb0 = !fb1;
    boolean lb0 = false;
    lb0 = !fb0;
    boolean lb1 = false;
    Output.points[6][8] -= ad1;
    fb0 = !fb1;
    lb0 = lb1 || fb0;
if(ao1 != null){
      ad2 = ao1.m3(fb1, lb0, lb1, fb0);
}
if(ao2 != null){
      ad3 = ao2.m3();
}
    boolean lb2 = true;
    fb0 = !fb1;
    Output.points[7][0] += ad4;
    double ld3 = 311.8943652916781;
    for(int i0=0; i0<10; i0++){
        if (lb0) {
if(ao4 != null){
              ao3 = ao4.m4(ad4, fd0, fd1, ld3, lb1, lb2, fb0, fb1);
}
            boolean lb4 = true;
if(fo0 != null){
              fo0.m1(fo1, ao1, ao2, ao3);
}
            boolean lb5 = false;
            lb4 = ad1 < ad2;
            lb5 = ad3 > ad4;
            double ld6 = 555.1825076097042;
            lb0 = !lb1;
            boolean lb7 = true;
            lb1 = ad4 < fd0;
            lb2 = fb0 && fb1;
            double ld8 = 54.10372930751631;
            double ld9 = 856.8633983828444;
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
    ab1 = !ab2;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
    double ld0 = 569.5365074168346;
if(ao1 != null){
      ab3 = ao1.m2(ld0, fd0, fd1, ld0);
}
        double ld1 = 651.5683982132248;
    ab4 = fb0 || fb1;
    ld1 = fd0 - fd1;
    ab1 = ld0 > ld1;
    double ld2 = 480.94009657226025;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld0);
}
    ld1 = ld2 + fd0;
    fd1 = ld0 + ld1;

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
    double ld1 = 425.0277621203139;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought38.getInstance();
    fb0 = !fb1;
    double ld3 = 256.2588069392181;
if(ao4 != null){
      ld1 = ao4.m3(ld3, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    boolean lb4 = false;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    lb4 = !ab1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    ld3 = ad1 + ad2;
    ad3 *= -1;

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
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    Output.points[7][1] -= fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought35.getInstance();
    Thought lo2 = Thought59.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    Output.points[7][2] -= fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    lb0 = fb0 || fb1;
    boolean lb3 = true;
    fd0 = fd1 - fd0;
    lb0 = lb3 || fb0;
    boolean lb4 = true;
    fd1 *= -1;
    boolean lb5 = true;
    double ld6 = 426.4263878586423;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    double ld0 = 389.2844977675571;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ld0 > fd0;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    ab1 = ld0 > fd0;
    fd1 = ld0 + fd0;
    fd1 *= -1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
        double ld0 = 177.06879187687116;
    ad3 = ad4 + fd0;
    Output.points[7][3] -= fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        fb0 = ad4 < fd0;
        fb1 = fd1 > ld0;
        fb0 = !fb1;
        double ld1 = 582.1569176525446;
        Thought lo2 = Thought78.getInstance(fb0, fb1, fb0, fb1);
        ld0 *= -1;
        Thought lo3 = Thought56.getInstance();
        fb0 = fb1 || fb0;
        }
    Output.points[7][4] += ad2;
    fb1 = fb0 || fb1;
    ad3 *= -1;
    ad4 = fd0 + fd1;

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
    ab2 = ad1 > ad2;
    ad3 = ad4 - fd0;
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = false;
    lb2 = ab1 && ab2;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    lb0 = lb1 && lb2;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = true;
    Output.points[7][5] -= ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    lb3 = lb4 && ab1;
    fd1 *= -1;
    ab2 = ab3 && ab4;
    boolean lb5 = true;
    ad1 *= -1;
        for(int i0=0; i0<10; i0++){
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
        fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd0 *= -1;
    fb0 = fd1 < fd0;
    Thought lo1 = Thought62.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought3.getInstance(fd1, fd0, fd1, fd0);
    boolean lb3 = true;
    lb0 = fd1 > fd0;
    lb3 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(lb3, fb0, fb1, lb0);
}
    lb3 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fb1 = lb0 || lb3;

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
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought85.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
    Thought lo1 = Thought28.getInstance(fd0, fd1, ad1, ad2);
    fb1 = fb0 && fb1;
    ad3 *= -1;
    Output.points[7][6] += ad4;
    fb0 = !fb1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought72.getInstance(fb1, fb0, fb1, fb0);
    fd0 = fd1 - ad1;
    if (fb1) {
        fb0 = fb1 || fb0;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ad1;
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
      ab1 = ao2.m2();
}
    double ld0 = 368.1107083917238;
if(ao3 != null){
      ao3.m2(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ab1 = fd1 < ld0;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought2.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
    ld0 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ld0 > fd0;
    for(int i0=0; i0<10; i0++){
        }
if(ao2 != null){
      ab4 = ao2.m2();
}
if(ao3 != null){
      ao3.m2(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ld0 = fd0 - fd1;
    Thought lo2 = Thought57.getInstance(ao4, fo0, fo1, ao1);
    ab3 = ld0 > fd0;
    boolean lb3 = true;
    fd1 *= -1;
    for(int i1=0; i1<10; i1++){
        ab3 = ld0 > fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb3);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 > fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][7] -= ad1;
    ab1 = ad2 < ad3;
    ab2 = !ab3;
    ab4 = ad4 < fd0;
    Thought lo0 = Thought61.getInstance(fd1, ad1, ad2, ad3);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    fb0 = !fb1;
    ab1 = ad2 > ad3;
    boolean lb1 = true;
    ad4 = fd0 - fd1;
    Output.points[7][8] += ad1;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb1);
}
    boolean lb2 = true;
    ad2 = ad3 - ad4;

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
double m3() throws CountDownExc {
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
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    Output.points[8][0] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought96.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
    double ld1 = 492.91486442422917;

Thought.STACK_COUNTER++;
return ld1;
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
if(fo0 != null){
      ab2 = fo0.m2(fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought54.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
    boolean lb3 = false;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb3, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    ab4 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;

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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    double ld1 = 884.8366571552326;
    lb0 = ad2 < ad3;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
        Output.points[8][1] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld1, ad1, lb0, fb0, fb1, lb0);
}
    double ld2 = 318.2885323500757;
    fb0 = !fb1;
    ad1 *= -1;
    lb0 = ad2 < ad3;
    if (fb0) {
        fb1 = lb0 && fb0;
        fb1 = lb0 || fb0;
        ad4 = fd0 + fd1;
        boolean lb3 = true;
}
Thought.STACK_COUNTER++;
return ld1;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 - ad2;
    Output.points[8][2] += ad3;
    double ld0 = 129.2848395762917;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought97.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    Output.points[8][3] += fd0;
    double ld0 = 499.4421138806857;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        boolean lb1 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        lb1 = fb0 && fb1;
        double ld2 = 617.578955890169;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
        fb1 = lb1 && fb0;
        double ld3 = 456.7847367703593;
        Output.points[8][4] += ld2;
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
    ad1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    ad2 *= -1;
if(ao1 != null){
      ao1.m1(ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    fb0 = ad1 > ad2;
    double ld0 = 414.86438226734026;
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ld0 = ad1 - ad2;
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    boolean lb1 = false;
    ab1 = !ab2;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[8][5] -= fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Thought lo2 = Thought11.getInstance(fo1, ao1, ao2, ao3, lb0, lb1, ab1, ab2);
    fd0 = fd1 - fd0;
    ab3 = fd1 > fd0;
    ab4 = fd1 < fd0;
if(ao4 != null){
      fb0 = ao4.m2(fd1, fd0, fd1, fd0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
        ab2 = !ab3;
        ab4 = fb0 || fb1;
        Thought lo0 = Thought78.getInstance();
        ab1 = ad2 < ad3;
        ad4 *= -1;
if(ao1 != null){
          ao1.m1(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        double ld1 = 837.259371919791;
        ad2 *= -1;
        ad3 *= -1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
        boolean lb2 = false;
        ab3 = ab4 && fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb2, ab1, ab2);
}
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
        Thought lo3 = Thought37.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
if(ao1 != null){
          ad2 = ao1.m3(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao2.m1();
}
        lb2 = ad3 < ad4;
        }
    boolean lb4 = true;
    double ld5 = 494.96318971553006;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb1 = !lb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
    boolean lb1 = true;
    if (lb0) {
        boolean lb2 = false;
        fd1 *= -1;
        lb0 = lb1 || fb0;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb2, lb0, lb1);
}
        fb0 = !fb1;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 683.9197141027801;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ab1 = ld0 > fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    fd1 = ld0 - fd0;
    fb1 = fd1 < ld0;
if(fo0 != null){
      ab1 = fo0.m2();
}
    ab2 = fd0 < fd1;
if(fo1 != null){
      ab3 = fo1.m2(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
    Thought lo1 = Thought10.getInstance(fo0, fo1, fo0, fo1);
    double ld2 = 870.4638578942719;

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
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    Thought lo1 = Thought39.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    fb0 = ad2 < ad3;
    boolean lb2 = false;
    if (fb0) {
        double ld3 = 266.2347314381573;
        ad3 = ad4 - fd0;
        Thought lo4 = Thought89.getInstance(fd1, ld3, ad1, ad2);
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        fb1 = lb0 && lb2;
        ld3 *= -1;
if(fo0 != null){
          fo0.m3(fb0, fb1, lb0, lb2);
}
        ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
        boolean lb5 = false;
if(fo1 != null){
          fo1.m1();
}
        lb2 = fb0 || fb1;
if(fo0 != null){
          ld3 = fo0.m3(ad1, ad2, ad3, ad4, lb5, lb0, lb2, fb0);
}
        fb1 = !lb5;
        lb0 = lb2 || fb0;
        Thought lo6 = Thought62.getInstance(fo1, fo0, fo1, fo0);
        boolean lb7 = true;
        fb0 = fd0 > fd1;
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
    double ld0 = 153.48114725969612;
    Output.points[8][6] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        ld0 = ad1 - ad2;
        fb0 = fb1 || ab1;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
        double ld1 = 469.94649215140544;
        double ld2 = 423.7140188110113;
        Thought lo3 = Thought81.getInstance(fo0, fo1, fo0, fo1, ld1, ld2, ld0, ad1);
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              ad2 = fo0.m3(ab2, ab3, ab4, fb0);
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
    fb1 = fb0 || fb1;
    double ld0 = 289.22936244158086;
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    ld0 = fd0 + fd1;
    lb1 = ld0 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld2 = 1000.9561690024461;
    fb0 = !fb1;
    fd0 *= -1;
    fd1 = ld0 - ld2;
    Output.points[8][7] -= fd0;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, ld2, fd0, fb0, fb1, lb1, fb0);
}
    Output.points[8][8] -= fd1;
    boolean lb3 = false;
    fb0 = ld0 > ld2;
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, lb3, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      ad4 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    Thought lo0 = Thought89.getInstance();
if(ao3 != null){
      fb0 = ao3.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 286.06791134545296;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld2 = 625.5079240174161;
    ad2 = ad3 + ad4;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ld2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    ab1 = !ab2;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m3();
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    Thought lo1 = Thought0.getInstance(fo0, fo1, ao1, ao2);
    for(int i0=0; i0<10; i0++){
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
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    ad2 *= -1;
    Thought lo0 = Thought6.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    ab2 = ad2 < ad3;
    ab3 = !ab4;
    fb0 = fb1 || ab1;
    Output.points[0][0] -= ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    double ld1 = 593.8101118149323;
    ad4 = fd0 - fd1;
    boolean lb2 = true;
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3);
}
        ab4 = fb0 && fb1;
        ad4 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(lb2, ab1, ab2, ab3);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        Output.points[0][1] += ld1;
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
        Thought lo3 = Thought77.getInstance(ao3, ao4, fo0, fo1);
        Thought lo4 = Thought27.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ad1, ab1, ab2, ab3, ab4);
        fb0 = fb1 && lb2;
        ab1 = ab2 && ab3;
if(fo0 != null){
          ad2 = fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb2);
}
        ab1 = ad3 < ad4;
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
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    Output.points[0][2] += fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    fd0 *= -1;
        fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;

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
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
        double ld2 = 659.3086464553475;
    ld2 = fd0 - fd1;
    ld2 = fd0 + fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        double ld0 = 824.4986130461381;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    lb1 = !lb2;
    double ld3 = 884.1872784456417;
    fb0 = fd0 < fd1;
    fb1 = ld0 < ld3;
    boolean lb4 = true;
    boolean lb5 = true;
    boolean lb6 = true;
if(fo0 != null){
      fo0.m1(lb1, lb2, lb4, lb5);
}
    lb6 = fb0 || fb1;

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

package genetic;
import java.util.ArrayList;
class Thought19 extends Thought{
private static ArrayList<Thought19> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 400.4100107095447;
private double fd1 = 852.2954296590167;
private Thought fo0 = null;
private Thought fo1 = null;
Thought19 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought19 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought19 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought19 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought19 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    if (fb1) {
if(fo1 != null){
          fo1.m2();
}
        Output.points[7][6] += fd1;
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo1.m3(fb0, fb1, fb0, fb1);
}
        fb0 = fd1 < fd0;
        fb1 = fd1 < fd0;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb0 = fb1 || fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        double ld0 = 980.3018242932405;
        fb0 = fb1 && fb0;
        boolean lb1 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ld0 = fd0 - fd1;
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    Output.points[7][7] += fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought17.getInstance(ab1, ab2, ab3, ab4);
    double ld1 = 638.8252938279871;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    double ld2 = 858.2791921050433;
    fb1 = ab1 || ab2;
    boolean lb3 = false;
    double ld4 = 708.5860972763503;
    boolean lb5 = true;
    boolean lb6 = false;
    lb6 = ab1 && ab2;

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
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb1 = fd1 > ad1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < ad1;
    lb0 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = ad4 < fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = ad3 > ad4;
    fb0 = fd0 > fd1;
    fb1 = lb0 && fb0;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought86.getInstance(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
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
if(fo0 != null){
      ad1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    Thought lo0 = Thought35.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
    fb0 = !fb1;
    Thought lo1 = Thought72.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = fd1 > ad1;

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
    double ld0 = 836.9792678848842;
    fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2();
}
    fb0 = fd0 < fd1;
    Output.points[7][8] += ld0;
    Thought lo1 = Thought94.getInstance(fd0, fd1, ld0, fd0);
    fb1 = fd1 > ld0;
    double ld2 = 480.8899111879767;
    fb0 = fb1 && fb0;
    fb1 = ld2 > fd0;
    fb0 = fb1 && fb0;
    double ld3 = 267.0188258497586;
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    boolean lb4 = true;
    double ld5 = 313.0278861577917;
    ld0 = ld2 + ld3;
    lb4 = !fb0;
if(ao3 != null){
      ld5 = ao3.m3(fb1, lb4, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ld3, ld5, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld2, ld3, lb4, fb0, fb1, lb4);
}
    fb0 = fb1 || lb4;
    Output.points[8][0] -= ld5;
    fd0 = fd1 + ld0;

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
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought70.getInstance(ao2, ao3, ao4, fo0);
    double ld2 = 613.0603391841004;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld3 = 565.8216299102934;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld2, ld3);
}
    lb0 = !fb0;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb4);
}
    Thought lo5 = Thought63.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    double ld6 = 598.3443056797315;
    fb0 = fb1 || lb0;
    Output.points[8][1] += ad4;
    lb4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ld3, lb0, lb4, fb0, fb1);
}
    double ld7 = 404.05750354058233;
    boolean lb8 = false;

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
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = !fb0;
    fb1 = !lb0;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
        ab2 = !ab3;
    fd0 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought90.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    boolean lb3 = true;
if(fo1 != null){
      lb0 = fo1.m2();
}
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    lb1 = lb3 && ab1;
    double ld4 = 610.4789851240473;
    boolean lb5 = true;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    Thought lo6 = Thought53.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld4, fd0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    Thought lo7 = Thought44.getInstance(ao2, ao3, ao4, fo0, lb3, lb5, ab1, ab2);

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
    ad1 = ad2 + ad3;
    ad4 *= -1;
    Output.points[8][2] += fd0;
    fd1 = ad1 - ad2;
    Output.points[8][3] -= ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = ad3 > ad4;
if(ao4 != null){
      ab1 = ao4.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    if (ab2) {
if(fo1 != null){
          ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        fd1 = ad1 - ad2;
        boolean lb1 = true;
        ad3 *= -1;
        boolean lb2 = true;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, lb2, lb0, ab1);
}
        } else if (ab4) {
        if (fb0) {
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
            Output.points[8][4] -= ad4;
            fb1 = fd0 > fd1;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
    Output.points[8][5] -= fd0;
    boolean lb0 = false;
    lb0 = fd1 > fd0;
        boolean lb1 = true;
    lb1 = !fb0;
    Thought lo2 = Thought53.getInstance(fd1, fd0, fd1, fd0);
    double ld3 = 600.4866861428352;
if(fo1 != null){
      fo1.m2(fb1, lb0, lb1, fb0);
}
    Thought lo4 = Thought44.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);

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
    Output.points[8][6] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = !lb1;
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
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
    Output.points[8][7] += ad1;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      ad2 = fo0.m3(lb0, lb1, fb0, fb1);
}
    lb0 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    lb1 = fb0 && fb1;
    lb0 = lb1 && fb0;
    double ld2 = 669.546338934185;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[8][8] += ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ad3 = ad4 - fd0;
    boolean lb0 = true;
    Thought lo1 = Thought18.getInstance();
    Output.points[0][0] -= fd1;
    ab2 = ad1 < ad2;
    ab3 = ad3 > ad4;
    fd0 *= -1;
    ab4 = fd1 < ad1;
    boolean lb2 = false;
    ab4 = fb0 && fb1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb2, ab1, ab2);
}
    ad1 = ad2 + ad3;
    Thought lo3 = Thought63.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, lb0, lb2, ab1, ab2);
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
if(ao1 != null){
      fb1 = ao1.m2();
}
    if (fb0) {
if(ao2 != null){
          ao2.m1(fd1, fd0, fd1, fd0);
}
        fb1 = fb0 || fb1;
        fd1 = fd0 - fd1;
        boolean lb0 = false;
        boolean lb1 = false;
        double ld2 = 269.36074950354623;
        lb0 = ld2 > fd0;
        Thought lo3 = Thought82.getInstance(lb1, fb0, fb1, lb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
    ad1 = ad2 + ad3;
    lb0 = ad4 < fd0;
    Thought lo2 = Thought83.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
    double ld3 = 304.99394118799216;
    lb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
    fd1 = ld3 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    ld3 = ad1 + ad2;
    lb0 = lb1 || fb0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, lb0, lb1, fb0, fb1);
}
    lb0 = ad3 > ad4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 20.43971021996953;
if(ao4 != null){
      ab2 = ao4.m2(ab3, ab4, fb0, fb1);
}
    ld0 = fd0 + fd1;
    boolean lb1 = true;
    lb1 = ab1 && ab2;
    ld0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
    Output.points[0][1] += fd1;
    boolean lb2 = true;
    ab2 = ab3 || ab4;
    ld0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb2);
}

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
    ab2 = ab3 && ab4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    double ld0 = 729.5855514869171;
    boolean lb1 = false;
    ld0 *= -1;
    ad1 = ad2 + ad3;
    Thought lo2 = Thought3.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    double ld3 = 590.0890108793315;
if(ao1 != null){
      ao1.m3();
}
    if (lb1) {
        Thought lo4 = Thought63.getInstance(ld3, ad1, ad2, ad3);
if(ao2 != null){
          ao2.m3(ab1, ab2, ab3, ab4);
}
        Output.points[0][2] += ad4;
        boolean lb5 = true;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
        boolean lb0 = false;
    Thought lo1 = Thought17.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    Thought lo2 = Thought39.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    fd1 = fd0 + fd1;
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
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
    Thought lo0 = Thought72.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought46.getInstance(fb0, fb1, ab1, ab2);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    Output.points[0][3] += fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, ab1, ab2);
}
    ab3 = fd0 > fd1;
    Output.points[0][4] += fd0;
    if (ab4) {
        Output.points[0][5] -= fd1;
        boolean lb3 = true;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Thought lo5 = Thought93.getInstance();
        lb3 = !lb4;
        lb2 = fd0 < fd1;
        fd0 *= -1;
        ab1 = ab2 && ab3;
        ab4 = fd1 > fd0;
        Thought lo6 = Thought94.getInstance(fd1, fd0, fd1, fd0);
        fd1 = fd0 + fd1;
        fb0 = fb1 || lb3;
        fd0 *= -1;
        lb4 = fd1 > fd0;
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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought85.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
        double ld2 = 412.80449769667615;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        Thought lo3 = Thought54.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fd1 = fo1.m3(ld2, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
        ad4 *= -1;
        Output.points[0][6] += fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m2(fd1, ld2, ad1, ad2);
}
if(fo1 != null){
          lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
        fb1 = ad3 < ad4;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1);
}
        fb0 = fb1 || lb0;
        Output.points[0][7] += ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
        lb0 = ld2 > ad1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m1(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
}
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
      ad2 = fo0.m3();
}
    Output.points[0][8] += ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fb1 = !ab1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
        boolean lb0 = true;
        fb0 = ad2 > ad3;
        ad4 = fd0 - fd1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
        ad2 = ad3 - ad4;
        ab3 = fd0 < fd1;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Thought lo1 = Thought73.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
        boolean lb2 = false;
if(fo0 != null){
          fo0.m3();
}
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
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    Output.points[1][0] -= fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    Thought lo1 = Thought38.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    if (lb0) {
        double ld2 = 442.4252446632091;
        fb0 = fd0 < fd1;
        fb1 = lb0 && fb0;
        ld2 = fd0 + fd1;
        fb1 = lb0 && fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Thought lo3 = Thought4.getInstance(ld2, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          lb0 = ao3.m2(fd0, fd1, ld2, fd0);
}
if(ao4 != null){
          ao4.m1(fb0, fb1, lb0, fb0);
}
        fb1 = fd1 > ld2;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0);
}
        lb0 = fb0 && fb1;
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
    fb0 = ad2 > ad3;
    Thought lo0 = Thought29.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    double ld2 = 424.5889867568279;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
    ad4 = fd0 + fd1;
    Output.points[1][1] -= ld2;
    ad1 *= -1;
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, ad1, lb1, fb0, fb1, lb1);
}
    fb0 = ad2 < ad3;
    double ld3 = 534.5360873560785;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    fb1 = ld2 < ld3;
    Thought lo4 = Thought99.getInstance();

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
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        boolean lb0 = false;
        lb0 = ab1 && ab2;
        fd1 = fd0 - fd1;
        ab3 = fd0 < fd1;
        ab4 = fd0 > fd1;
        fb0 = fb1 && lb0;
        boolean lb1 = true;
        fd0 *= -1;
        Thought lo2 = Thought11.getInstance(lb1, ab1, ab2, ab3);
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
        Thought lo3 = Thought7.getInstance(ao1, ao2, ao3, ao4, lb1, ab1, ab2, ab3);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        boolean lb4 = true;
        ab3 = !ab4;
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, lb4, ab1, ab2);
}
        Thought lo5 = Thought36.getInstance();
        Thought lo6 = Thought51.getInstance(fd0, fd1, fd0, fd1);
        ab3 = fd0 > fd1;
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
    ad2 = ad3 - ad4;
    double ld0 = 24.783654910797765;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
}
    double ld1 = 883.4709893882574;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought23.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 + fd1;
    double ld0 = 246.4782416867538;
    double ld1 = 170.41319632536556;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(ld0, ld1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    boolean lb2 = true;
    Thought lo3 = Thought83.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
    Thought lo4 = Thought76.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
    Output.points[1][2] -= ld1;

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
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought70.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo0.m1();
}
    ab4 = !fb0;
    fd0 = fd1 + fd0;

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
    Output.points[1][3] += ad2;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[1][4] -= ad1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought0.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = ad4 > fd0;
    fb1 = fb0 || fb1;
    if (fb0) {
        Output.points[1][5] -= fd1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        double ld1 = 80.85044995477743;
        fb1 = ad1 < ad2;
        Output.points[1][6] -= ad3;
if(fo1 != null){
          fo1.m1(ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
        Output.points[1][7] += ad1;
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
    ab1 = ad1 > ad2;
    ab2 = ad3 < ad4;
    if (ab3) {
        } else {
        Output.points[1][8] += fd0;
        ab4 = !fb0;
        fb1 = fd1 < ad1;
if(fo1 != null){
          ad2 = fo1.m3();
}
        Thought lo0 = Thought19.getInstance(ad3, ad4, fd0, fd1);
        boolean lb1 = true;
        double ld2 = 815.9337321409695;
        boolean lb3 = false;
        Thought lo4 = Thought12.getInstance(lb1, lb3, ab1, ab2);
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
}
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb1;
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb0 = !fb1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    double ld1 = 894.5657764106841;
    fd0 = fd1 + ld1;
        boolean lb2 = false;
    lb0 = !lb2;
    fd0 *= -1;
    boolean lb3 = true;
    lb3 = fb0 || fb1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    Output.points[2][0] += ad2;
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
        ad3 *= -1;
        boolean lb0 = true;
        fb0 = fb1 || lb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
        Output.points[2][1] -= ad2;
        boolean lb1 = false;
        boolean lb2 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        ad3 = ad4 + fd0;
        fd1 = ad1 + ad2;
        lb0 = lb1 && lb2;
if(ao4 != null){
          ao4.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
        boolean lb3 = true;
        if (lb2) {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
        boolean lb0 = false;
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao4 != null){
          fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
    Output.points[2][2] -= fd1;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    double ld1 = 864.3273125707099;
    ld1 = fd0 - fd1;
    fb1 = !lb0;
    Output.points[2][3] += ld1;
    boolean lb2 = false;
    double ld3 = 464.92378545937873;
    ld3 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld1, ld3, fd0, fd1);
}
    Thought lo4 = Thought45.getInstance(fo0, fo1, ao1, ao2, ld1, ld3, fd0, fd1, lb2, ab1, ab2, ab3);
    if (ab4) {
        Thought lo5 = Thought14.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb2);
        Output.points[2][4] += ld1;
        ld3 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fd0 = fd1 - ld1;
        ld3 *= -1;
        ab1 = fd0 < fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = !ab2;
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3();
}
    boolean lb1 = false;
if(ao4 != null){
      fd1 = ao4.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      lb0 = fo0.m2(lb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    fb1 = lb0 || lb1;
    lb2 = ab1 && ab2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    lb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    fd0 *= -1;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
        fb0 = fd1 < fd0;
    Thought lo1 = Thought61.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb1 = fd1 > fd0;
    fd1 *= -1;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
        double ld2 = 86.58243953232854;
    boolean lb3 = false;
    lb3 = ld2 > fd0;

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
    Thought lo0 = Thought46.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    Output.points[2][5] += fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    double ld2 = 66.21480728198142;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
        boolean lb3 = true;
    boolean lb4 = false;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;

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
    fb0 = fd0 < fd1;
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
    double ld1 = 215.3795484267627;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought78.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    fb0 = !fb1;
    fd0 = fd1 - ld1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    double ld3 = 92.17409324439089;
    ld3 *= -1;
    lb0 = fb0 && fb1;
    lb0 = fd0 < fd1;
if(fo0 != null){
      ld1 = fo0.m3();
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
}

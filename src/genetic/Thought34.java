package genetic;
import java.util.ArrayList;
class Thought34 extends Thought{
private static ArrayList<Thought34> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 144.42965898052876;
private double fd1 = 739.257957965549;
private Thought fo0 = null;
private Thought fo1 = null;
Thought34 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought34 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought34 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought34 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought34 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought34 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought34 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought34 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought34 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought34 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought34 instance = new Thought34 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    Output.points[4][1] += fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[4][2] -= fd1;
    fb0 = fb1 || lb0;

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
    Output.points[4][3] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[4][4] += fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld0 = 465.6223825115266;
if(fo0 != null){
      fb1 = fo0.m2(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ab1 = !ab2;

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
    Thought lo0 = Thought14.getInstance(fb0, fb1, fb0, fb1);
    ad1 = ad2 + ad3;
    double ld1 = 503.61143885298617;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = true;
    Thought lo3 = Thought72.getInstance(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
    fb0 = ld1 < ad1;
    fb1 = ad2 < ad3;
    double ld4 = 326.3614068336954;
    double ld5 = 679.2890484891606;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;
    double ld6 = 242.26226639999427;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
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
      ab1 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    double ld0 = 53.10813682866534;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
    double ld1 = 982.8117418980928;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 *= -1;
    ad2 *= -1;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = !fb0;
    fb1 = ld1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = fd1 > ld0;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    ab4 = ld1 < ad1;
    double ld2 = 474.68718150767523;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb3 = false;

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
    boolean lb0 = false;
    double ld1 = 883.8325945484638;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
    fb0 = fd1 > ld1;
    fd0 = fd1 + ld1;
    fd0 = fd1 - ld1;
    Output.points[4][5] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
    lb0 = !lb2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fd1 < ld1;
    fd0 = fd1 + ld1;
    fd0 = fd1 + ld1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0, fb1, lb0, lb2, fb0);
}
    double ld3 = 226.06348280722278;
    fb1 = !lb0;
    Thought lo4 = Thought51.getInstance(fo1, ao1, ao2, ao3);
    fd0 = fd1 + ld1;

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m1();
}
    fb0 = ad2 > ad3;
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought67.getInstance(ao4, fo0, fo1, ao1);
    double ld1 = 811.9039197059242;
    boolean lb2 = true;
    double ld3 = 334.6974307419993;
    ad1 = ad2 + ad3;

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
    boolean lb0 = false;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[4][6] += fd1;
    Thought lo1 = Thought40.getInstance(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
    boolean lb2 = true;
        boolean lb3 = true;
    double ld4 = 580.7102354360171;
    Thought lo5 = Thought26.getInstance(ld4, fd0, fd1, ld4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld4, fd0);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, lb2);
}
if(ao1 != null){
      ao1.m3();
}
    lb3 = !ab1;
    Thought lo6 = Thought75.getInstance(ld4, fd0, fd1, ld4, ab2, ab3, ab4, fb0);
    double ld7 = 902.8462228289833;
    boolean lb8 = true;

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
          ao2.m1(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = fd1 > ad1;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
    lb1 = fd1 > ad1;

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
    Thought lo0 = Thought75.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought97.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb2, fb0, fb1);
}
    fd1 = fd0 - fd1;
    Thought lo3 = Thought49.getInstance(fo0, fo1, fo0, fo1);
    lb2 = fb0 && fb1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab4 = fb0 || fb1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought85.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    ab4 = fd1 > fd0;
    boolean lb2 = true;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    lb2 = ab1 || ab2;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(lb1, lb2, ab1, ab2);
}
    Thought lo3 = Thought0.getInstance();
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    Thought lo0 = Thought53.getInstance(fo1, fo0, fo1, fo0);
    Output.points[4][7] -= ad1;
    Output.points[4][8] += ad2;
    boolean lb1 = false;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    double ld2 = 779.1613983723917;
    fb0 = ad1 > ad2;
    fb1 = lb1 || fb0;
    Output.points[5][0] -= ad3;
    Output.points[5][1] += ad4;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    lb1 = ad1 < ad2;
    fb0 = fb1 && lb1;
    ad3 = ad4 + fd0;
    Thought lo3 = Thought58.getInstance(fd1, ld2, ad1, ad2);
    fb0 = !fb1;
    boolean lb4 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        Thought lo5 = Thought53.getInstance(lb1, lb4, fb0, fb1);
        boolean lb6 = true;
        Thought lo7 = Thought91.getInstance();
if(fo0 != null){
          fo0.m2(ld2, ad1, ad2, ad3, lb6, lb1, lb4, fb0);
}
        fb1 = ad4 > fd0;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ab2 = ad4 < fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
    ab3 = ad3 > ad4;
    boolean lb0 = false;
    ab3 = fd0 > fd1;
    boolean lb1 = true;
    Thought lo2 = Thought2.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    boolean lb3 = true;
    lb0 = lb1 && lb3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    Output.points[5][2] += ad4;
    fb0 = fd0 < fd1;
    fb1 = lb0 && lb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    lb3 = fd1 < ad1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, lb0);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
          fd1 = ao1.m3();
}
    boolean lb0 = true;
    Thought lo1 = Thought76.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    boolean lb2 = false;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    fd0 *= -1;
    boolean lb3 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb2, lb3, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(lb2, lb3, fb0, fb1);
}
    Output.points[5][3] += fd1;
        fd0 *= -1;
    Thought lo4 = Thought9.getInstance();
    boolean lb5 = true;
    lb0 = lb2 && lb3;
    double ld6 = 897.1625155979923;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld6, fd0, lb5, fb0, fb1, lb0);
}
    double ld7 = 797.9536054665282;
    fd0 = fd1 - ld6;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    Thought lo0 = Thought71.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    fb1 = ad4 > fd0;
    if (fb0) {
if(ao4 != null){
          fb1 = ao4.m2(fd1, ad1, ad2, ad3);
}
        fb0 = ad4 < fd0;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
          ao4.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        ad3 = ad4 - fd0;
        fd1 = ad1 - ad2;
        fb1 = fb0 && fb1;
        ad3 = ad4 - fd0;
        fb0 = !fb1;
        fd1 = ad1 + ad2;
        fb0 = ad3 < ad4;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        Output.points[5][4] += ad4;
        fb1 = fd0 < fd1;
        boolean lb1 = true;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
}
        ad1 *= -1;
        ad2 *= -1;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 244.9317774567084;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ld0;
if(ao4 != null){
      fd0 = ao4.m3();
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ld0 = fd0 - fd1;
    ab3 = ld0 > fd0;
    boolean lb1 = true;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
}
    Thought lo2 = Thought56.getInstance(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
if(ao4 != null){
      ao4.m2(ld0, fd0, fd1, ld0);
}
    double ld3 = 699.3538613233952;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m1(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = ad1 > ad2;
    Thought lo0 = Thought58.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    boolean lb1 = true;
    Output.points[5][5] += ad2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, lb1, ab1, ab2);
}
    ad1 *= -1;
    boolean lb2 = true;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb1, lb2);
}
    fd0 = fd1 - ad1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 815.5581950186728;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, lb0, lb2, fb0, fb1);
}
    double ld3 = 150.06556068472304;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        boolean lb4 = false;
        Thought lo5 = Thought28.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld1, lb4, lb0, lb2, fb0);
}
Thought.STACK_COUNTER++;
return ld3;
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
    Thought lo0 = Thought10.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought77.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = fd1 > fd0;
    if (ab3) {
        boolean lb2 = false;
if(fo0 != null){
          fd1 = fo0.m3();
}
if(fo1 != null){
          ab3 = fo1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb3, ab1, ab2, ab3);
}
        double ld4 = 203.05074635131297;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
        lb3 = ld4 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld4, fd0, fd1);
}
        boolean lb5 = false;
        lb5 = ld4 < fd0;
        boolean lb6 = true;
        lb6 = fd1 < ld4;
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
    Thought lo0 = Thought39.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    double ld1 = 613.9957447699148;
    double ld2 = 463.6627665362745;
    fb0 = ad3 < ad4;
    Thought lo3 = Thought93.getInstance(fb1, fb0, fb1, fb0);
    boolean lb4 = false;
    boolean lb5 = true;
    Thought lo6 = Thought27.getInstance();
if(fo0 != null){
      lb5 = fo0.m2(fd0, fd1, ld1, ld2, fb0, fb1, lb4, lb5);
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    Output.points[5][6] += fd1;
    ld1 = ld2 + ad1;
    boolean lb7 = false;
    fb0 = fb1 && lb4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb5, lb7, fb0, fb1);
}
    Output.points[5][7] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, lb5, lb7, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, ad1, ad2);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m2();
}
    ab2 = ab3 && ab4;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    Output.points[5][8] += ad1;
    double ld0 = 398.3614157183502;
    ab4 = ad1 < ad2;

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
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        double ld0 = 988.6576599961744;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        ld0 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
        fd0 = fd1 + ld0;
        } else {
        fb0 = fb1 && fb0;
        fb1 = !fb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        fb1 = fd1 > fd0;
        Thought lo1 = Thought95.getInstance(fb0, fb1, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
        ad1 *= -1;
        ad2 = ad3 - ad4;
if(ao1 != null){
          ao1.m1();
}
        fb1 = !fb0;
        fb1 = fd0 < fd1;
        ad1 *= -1;
        double ld0 = 191.97736928873442;
        Output.points[6][0] += ad1;
        fb0 = ad2 > ad3;
        } else {
        fb1 = !fb0;
        if (fb1) {
            Thought lo1 = Thought3.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
            Output.points[6][1] -= ad3;
            fb0 = ad4 > fd0;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
              fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
            fb1 = !fb0;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought16.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    Output.points[6][2] += fd1;
    fb1 = fd0 > fd1;
    if (ab1) {
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        ab2 = fd1 > fd0;
        fd1 = fd0 + fd1;
        ab3 = fd0 < fd1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        boolean lb1 = true;
        ab3 = fd1 < fd0;
        fd1 = fd0 + fd1;
        fd0 *= -1;
        fd1 = fd0 + fd1;
if(ao1 != null){
          fo1 = ao1.m4(ab4, fb0, fb1, lb1);
}
        ab1 = ab2 && ab3;
        Thought lo2 = Thought53.getInstance();
        ab4 = !fb0;
        fb1 = lb1 || ab1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][3] -= ad2;
        ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = ad4 < fd0;
    fd1 *= -1;
    boolean lb0 = false;
    ad1 *= -1;
    Thought lo1 = Thought90.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    boolean lb2 = true;
    Output.points[6][4] -= ad3;
    ab1 = ad4 > fd0;
    ab2 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    lb0 = lb2 || ab1;
    ad2 = ad3 - ad4;
    ab2 = ab3 && ab4;
    Thought lo3 = Thought88.getInstance();
    boolean lb4 = true;
    ab4 = fb0 && fb1;
    fd0 *= -1;
    Thought lo5 = Thought85.getInstance(fd1, ad1, ad2, ad3, lb0, lb2, lb4, ab1);

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
    Output.points[6][5] += fd0;
    Thought lo0 = Thought97.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    Thought lo2 = Thought9.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
    boolean lb3 = true;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      lb3 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought16.getInstance(lb3, fb0, fb1, lb1);
    if (lb3) {
        fd0 *= -1;
        Output.points[6][6] += fd1;
if(fo1 != null){
          fo1.m2();
}
        fb0 = fb1 && lb1;
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
    Thought lo0 = Thought58.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
    Thought lo1 = Thought45.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld2 = 143.87960083765;
    boolean lb3 = false;
    ab2 = !ab3;
    fd0 *= -1;
    ab4 = fb0 && fb1;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
    ab1 = ab2 || ab3;
    ab4 = ld2 < fd0;
    fd1 = ld2 + fd0;
    fd1 *= -1;
    boolean lb4 = true;

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
    double ld0 = 213.04277718855442;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      ld0 = fo0.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought71.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    ad3 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m3();
}
    double ld2 = 517.4618086939363;

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
    Thought lo0 = Thought7.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[6][7] += fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
    ad4 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
    ab2 = fd0 < fd1;
    boolean lb2 = false;
    ad1 = ad2 - ad3;
    Thought lo3 = Thought97.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab2 = ab3 && ab4;
    double ld4 = 307.87398130110284;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb2);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fd1, ld4, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad3 > ad4;
    double ld5 = 689.0048003311247;

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
    boolean lb0 = true;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    lb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought80.getInstance(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb0);
        Thought lo3 = Thought54.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
          lb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, lb0, lb1);
}
        double ld4 = 801.8297909327883;
        fb0 = ld4 > fd0;
        boolean lb5 = false;
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
          ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
    fb1 = fd0 > fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = ad4 > fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < ad1;
    double ld0 = 2.2664679941798855;
    double ld1 = 614.7896853921261;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        ad4 *= -1;
if(ao3 != null){
      ao3.m1(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb2, fb0);
}
    fb1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m2(ld0, ld1, ad1, ad2, lb2, fb0, fb1, lb2);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought66.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
        fb0 = fb1 && ab1;
        Thought lo1 = Thought53.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fb1 = fd1 > fd0;
if(ao2 != null){
          ao1 = ao2.m4();
}
        }
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    double ld2 = 850.5354662376982;
    fd0 = fd1 - ld2;
    ab1 = !ab2;
    ab3 = fd0 < fd1;
if(ao3 != null){
      ld2 = ao3.m3(fd0, fd1, ld2, fd0, ab4, fb0, fb1, ab1);
}
    Output.points[6][8] += fd1;
    boolean lb3 = false;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ab2 = ld2 > fd0;

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
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 - ad1;
    ab2 = ad2 > ad3;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    fb1 = lb0 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fd1 = ao3.m3(ab2, ab3, ab4, fb0);
}
        ad1 = ad2 + ad3;
        ad4 = fd0 + fd1;
        fb1 = lb0 || ab1;
        }
    ad1 = ad2 - ad3;
if(ao4 != null){
      ab2 = ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 *= -1;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld1 = 176.8778135794617;
    ab1 = ad2 > ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    double ld2 = 460.5383587288708;

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
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Thought lo2 = Thought32.getInstance(lb1, fb0, fb1, lb0);
    boolean lb3 = true;
    Output.points[7][0] += fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb1, lb3, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, lb3, fb0);
}
    fd1 = fd0 + fd1;
    Output.points[7][1] += fd0;
        boolean lb4 = false;
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
        fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 204.05451568562373;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1(lb2, fb0, fb1, lb0);
}
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo1.m3();
}
    double ld3 = 363.6844875952044;
    double ld4 = 2.1928281048688474;

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
    Thought lo0 = Thought20.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought26.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[7][2] -= fd0;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(lb3, fb0, fb1, lb1);
}
    lb3 = fd1 < fd0;
if(fo1 != null){
      fo1.m3();
}
    Output.points[7][3] += fd1;
    fb0 = fd0 > fd1;
    boolean lb4 = false;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb3);
}
    fd1 = fd0 + fd1;
    lb4 = fb0 && fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb3, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, lb3, lb4);
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

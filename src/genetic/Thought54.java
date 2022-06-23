package genetic;
import java.util.ArrayList;
class Thought54 extends Thought{
private static ArrayList<Thought54> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 988.7875170638742;
private double fd1 = 313.90255626007786;
private Thought fo0 = null;
private Thought fo1 = null;
Thought54 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought54 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought54 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought54 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought54 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought54 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought54 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought54 instance = new Thought54 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 916.0876122005774;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, fd0, fd1);
}
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    Output.points[1][0] += fd0;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, fb0, fb1);
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
      ab1 = fo0.m2();
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    Thought lo1 = Thought29.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
    if (ab1) {
        ab2 = fd1 < fd0;
        ab3 = !ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 + fd1;
        fb1 = !lb0;
        fd0 = fd1 + fd0;
        ab1 = ab2 && ab3;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
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
    fb0 = ad1 < ad2;
        fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = ad3 < ad4;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought54.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
    Output.points[1][1] -= ad2;
if(fo0 != null){
      ad3 = fo0.m3(fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    Thought lo1 = Thought60.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    ad1 = ad2 - ad3;
    ab4 = fb0 && fb1;
    ad4 = fd0 - fd1;
    Output.points[1][2] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    Output.points[1][3] += ad2;
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab1 = ad2 > ad3;
    double ld1 = 392.6276728999145;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought16.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
    ab1 = !ab2;
    ab3 = !ab4;
    fb0 = ld1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
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
    fd0 = fd1 - fd0;
    Thought lo0 = Thought61.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought46.getInstance();
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    boolean lb2 = false;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb2, fb0, fb1);
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
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    fb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = ad4 < fd0;
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
    fb1 = !lb0;

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
    double ld1 = 513.7566076776861;
    ld1 = fd0 - fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
if(ao3 != null){
      ao3.m2();
}
if(ao4 != null){
      ab1 = ao4.m2(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    Output.points[1][4] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ld1 = fd0 - fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
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
    ad1 *= -1;
    ad2 = ad3 - ad4;
    double ld0 = 842.7811361083805;
    double ld1 = 97.24517396407678;
if(ao1 != null){
      ab2 = ao1.m2(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld1, ad1, ad2);
}
    Output.points[1][5] -= ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ld0 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(ld1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ad4 = fd0 + fd1;
    ab1 = ld0 > ld1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    boolean lb2 = true;
    boolean lb3 = true;
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb5 = true;
    ad1 = ad2 - ad3;

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
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought21.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    double ld2 = 966.5880347652962;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    fb1 = ld2 > fd0;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    Output.points[1][6] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[1][7] -= fd1;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought93.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    boolean lb1 = false;
        boolean lb2 = true;
    Thought lo3 = Thought57.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, ab1, ab2);
}
    double ld4 = 519.1417651326442;
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld4);
}
    double ld5 = 508.96469266102997;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld4);
}
    double ld6 = 399.69465174846033;
        Thought lo7 = Thought81.getInstance(ab3, ab4, fb0, fb1);
    double ld8 = 114.93392405471064;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ld5, ld6, ld8, fd0, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo9 = Thought62.getInstance(fo1, fo0, fo1, fo0, fd1, ld4, ld5, ld6, ab3, ab4, fb0, fb1);
    lb1 = lb2 && ab1;
    ld8 *= -1;
    ab2 = fd0 < fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    ad1 = ad2 + ad3;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1);
}
    fb0 = !fb1;
    fb0 = ad2 < ad3;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb0 = !fb1;
    Output.points[1][8] += ad2;
    fb0 = ad3 < ad4;

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
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
    ab2 = ad1 < ad2;
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
if(fo1 != null){
          ab3 = fo1.m2();
}
    ab4 = !fb0;
    fb1 = ad3 > ad4;
    double ld0 = 420.70942105517327;
    ad4 = fd0 + fd1;
    Thought lo1 = Thought40.getInstance(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    Thought lo2 = Thought70.getInstance(fo0, fo1, fo0, fo1);
    double ld3 = 562.7769846434255;
    fb0 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 && ab2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld3, ab3, ab4, fb0, fb1);
}
        ad1 = ad2 + ad3;
        ab1 = ab2 || ab3;
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
    fb0 = fd1 > fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought54.getInstance(fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought39.getInstance();
        double ld2 = 981.5065743400684;
        Output.points[2][0] += ld2;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld2, fd0, fb0, fb1, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m3(lb0, lb1, fb0, fb1);
}
    Output.points[2][1] += ad3;
    lb0 = lb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = lb0 && lb1;
        fb0 = fb1 && lb0;
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld2 = 104.38754080902264;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld2, ad1, ad2);
}
    fb0 = fb1 || lb0;
    Thought lo3 = Thought81.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    lb1 = fb0 && fb1;
    lb0 = !lb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought92.getInstance(ab2, ab3, ab4, fb0);
    double ld1 = 979.0589618960538;
if(ao1 != null){
      ao1.m2();
}
    ld1 = fd0 - fd1;
    Thought lo2 = Thought8.getInstance(ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
    ab4 = fd0 < fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ld1 = fd0 - fd1;
    ld1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
    boolean lb3 = true;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb3);
}
    ab1 = !ab2;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, fd0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
    Thought lo4 = Thought55.getInstance(ab3, ab4, fb0, fb1);
    ld1 *= -1;
    fd0 = fd1 + ld1;
    Output.points[2][2] += fd0;
    fd1 = ld1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo5 = Thought45.getInstance(fd1, ld1, fd0, fd1, lb3, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb3);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    Output.points[2][3] += ld1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought65.getInstance(lb0, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    lb0 = !ab1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ab2 = ab3 || ab4;
    boolean lb2 = false;
    ab4 = fb0 || fb1;
    lb0 = !lb2;
    boolean lb3 = true;
    double ld4 = 253.81967113262795;
if(ao1 != null){
      lb3 = ao1.m2();
}
    double ld5 = 119.87144967457606;
if(ao2 != null){
      ab1 = ao2.m2(ld4, ld5, ad1, ad2, ab2, ab3, ab4, fb0);
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
    fb0 = !fb1;
    double ld0 = 938.3362243290301;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    ld0 = fd0 + fd1;
    boolean lb1 = true;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;

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
    ab1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab2 = !ab3;
        fd0 = fd1 + fd0;
    Thought lo0 = Thought50.getInstance(ab4, fb0, fb1, ab1);
    boolean lb1 = true;
    Thought lo2 = Thought2.getInstance();
    Output.points[2][4] -= fd1;
    boolean lb3 = false;
    double ld4 = 450.84836453996274;
if(fo1 != null){
      ld4 = fo1.m3(fd0, fd1, ld4, fd0, lb3, ab1, ab2, ab3);
}
    ab4 = fd1 > ld4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
    double ld5 = 422.56808307633366;
    fb1 = !lb1;
    ld4 = ld5 - fd0;

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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld0 = 861.2596583302279;
        ad4 = fd0 + fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4();
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
    Output.points[2][5] += ad1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
    ab4 = fd1 < ad1;
    Thought lo3 = Thought44.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
        double ld0 = 61.472919115246334;
    fb0 = fd0 > fd1;
    fb1 = ld0 < fd0;
    Output.points[2][6] += fd1;
    double ld1 = 575.3842306988441;
    ld0 = ld1 - fd0;
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, ld1, fd0, lb2, lb3, fb0, fb1);
}
    boolean lb4 = true;

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
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    lb1 = ad2 > ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought11.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
    fb0 = !fb1;
if(ao4 != null){
      lb0 = ao4.m2(ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought98.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
if(ao3 != null){
      ao3.m2(lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    fd1 *= -1;
    lb0 = !lb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    Output.points[2][7] += fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    lb1 = ad4 < fd0;
    fd1 = ad1 + ad2;

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
    fd1 = fd0 - fd1;
    Thought lo0 = Thought21.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 562.1142873059121;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
}
    ab1 = fd0 > fd1;
    ld1 = fd0 - fd1;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ld1 > fd0;
    ab4 = fd1 < ld1;
    Output.points[2][8] -= fd0;
    boolean lb2 = false;
    boolean lb3 = true;

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
if(ao3 != null){
          ao2 = ao3.m4();
}
        double ld0 = 144.29972373237325;
        ab1 = ld0 > ad1;
        ab2 = ad2 > ad3;
        for(int i1=0; i1<10; i1++){
            ab3 = ad4 < fd0;
            boolean lb1 = true;
if(ao4 != null){
              ao4.m2(fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
}}
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought55.getInstance();
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fb1 = lb1 || fb0;
    double ld2 = 194.06585640245024;
if(fo1 != null){
          fo1.m3(fd0, fd1, ld2, fd0, fb1, lb1, fb0, fb1);
}
    double ld3 = 265.21960131271425;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1, fb0, fb1, lb1, fb0);
}
    Thought lo4 = Thought2.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
    boolean lb5 = false;
    lb1 = ld2 > ld3;
    Thought lo6 = Thought15.getInstance(fd0, fd1, ld2, ld3);
    boolean lb7 = false;
    lb5 = fd0 < fd1;
    lb7 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb5, lb7, fb0);
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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    for(int i0=0; i0<10; i0++){
        }
    double ld0 = 632.8285022796405;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
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
    boolean lb0 = false;
    lb0 = ad2 < ad3;
    Thought lo1 = Thought93.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    boolean lb2 = true;
    Thought lo3 = Thought98.getInstance();
    ad2 = ad3 + ad4;
    fd0 *= -1;
    Thought lo4 = Thought20.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
    Thought lo5 = Thought35.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb0, lb2, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought27.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    boolean lb1 = false;
if(fo0 != null){
      ad3 = fo0.m3(fb0, fb1, lb1, ab1);
}
    ab2 = ad4 > fd0;
    ab3 = fd1 > ad1;
if(fo1 != null){
      ab4 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
    boolean lb2 = true;
    ab1 = fd1 < ad1;
    ad2 = ad3 - ad4;
    Thought lo3 = Thought32.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;

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
    double ld0 = 979.7252620029624;
    fb1 = fd0 > fd1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
    Output.points[3][0] -= fd1;
    Output.points[3][1] += ld0;
    Thought lo1 = Thought42.getInstance(fb0, fb1, fb0, fb1);
    if (fb0) {
        fd0 = fd1 + ld0;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          ao2.m1(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = ld0 - fd0;
        fb1 = fb0 && fb1;
        Thought lo2 = Thought28.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ld0 = fd0 - fd1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
            fb0 = fb1 || fb0;
            ld0 = fd0 + fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    Output.points[3][2] -= ad2;
    Thought lo0 = Thought34.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    ad1 *= -1;
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    fd1 *= -1;
    Thought lo1 = Thought92.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    Output.points[3][3] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
if(ao1 != null){
      fb1 = ao1.m2(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;

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
    ab1 = fd0 < fd1;
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb1 = ab1 || ab2;
    boolean lb0 = true;
    boolean lb1 = true;
    Output.points[3][4] += fd0;
    fd1 *= -1;
    double ld2 = 839.091770816034;
    ab1 = !ab2;
    ld2 = fd0 - fd1;
    Thought lo3 = Thought58.getInstance(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2);
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, ab1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    ab2 = fd1 < ld2;
    ab3 = fd0 > fd1;
if(ao2 != null){
              ab4 = ao2.m2(ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
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
    Thought lo0 = Thought2.getInstance(ao2, ao3, ao4, fo0);
    ab1 = !ab2;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 - fd0;
    Output.points[3][5] += fd1;
        ab1 = ab2 || ab3;
        ad1 *= -1;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought45.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
    ab2 = fd0 > fd1;
    boolean lb2 = true;
    double ld3 = 500.6218237386147;
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao3.m2(ld3, ad1, ad2, ad3);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld3);
}
    Thought lo4 = Thought0.getInstance(fb1, lb2, ab1, ab2);
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld3, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
    boolean lb5 = false;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao4.m1(ad4, fd0, fd1, ld3);
}
    ad1 = ad2 - ad3;

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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought63.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[3][6] -= fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < fd0;
    Output.points[3][7] -= fd1;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
    Output.points[3][8] += fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 = fd1 - fd0;
    Output.points[4][0] -= fd1;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;

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
    boolean lb0 = false;
    Output.points[4][1] -= fd1;
    lb0 = fb0 && fb1;
    double ld1 = 970.3149144425264;
    Output.points[4][2] += ld1;
    lb0 = fb0 || fb1;
    fd0 *= -1;
    Thought lo2 = Thought89.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Output.points[4][3] -= ld1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    boolean lb3 = true;
    fb0 = ld1 < fd0;

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
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fb1 = !fb0;
        fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    Thought lo1 = Thought29.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    fd0 *= -1;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo3 = Thought63.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb0 = fb1 && lb0;
    double ld4 = 168.3915763532006;
    lb2 = ld4 > fd0;

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

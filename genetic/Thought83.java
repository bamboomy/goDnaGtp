package genetic;
import java.util.ArrayList;
class Thought83 extends Thought{
private static ArrayList<Thought83> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 611.7435260880815;
private double fd1 = 988.4727012105927;
private Thought fo0 = null;
private Thought fo1 = null;
Thought83 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought83 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought83 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought83 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought83 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought83 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought83 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought83 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought83 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    double ld1 = 591.7302503723666;
    Output.points[5][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
    ld1 = fd0 - fd1;
    ld1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    Output.points[5][8] -= ld1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought298.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
        if (fb1) {
        boolean lb1 = false;
        Thought lo2 = Thought368.getInstance();
        fd0 = fd1 - fd0;
        Thought lo3 = Thought6.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
        ab4 = !fb0;
        Output.points[6][0] += fd1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo1.m2(fb1, lb1, ab1, ab2);
}
        double ld4 = 115.86579433610716;
        ab3 = fd0 > fd1;
        ab4 = fb0 || fb1;
        lb1 = ld4 > fd0;
        } else {
                Thought lo5 = Thought190.getInstance(fo0, fo1, fo0, fo1);
        ab2 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        ab3 = !ab4;
        fd0 = fd1 + fd0;
        double ld6 = 734.7914566734463;
        double ld7 = 527.1515326237837;
        fb0 = fb1 && ab1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ld7, fd0, fd1, ld6);
}
if(fo0 != null){
          fo1 = fo0.m4(ld7, fd0, fd1, ld6, ab2, ab3, ab4, fb0);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo0.m3();
}
    if (fb1) {
        double ld1 = 57.793161453743465;
        lb0 = ad3 < ad4;
        fb0 = fd0 > fd1;
        ld1 = ad1 - ad2;
        fb1 = ad3 > ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, lb0, fb0, fb1, lb0);
}
        Thought lo2 = Thought173.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        ld1 = ad1 + ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        ld1 = ad1 - ad2;
        boolean lb3 = true;
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
    Output.points[6][1] -= ad2;
    boolean lb0 = true;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought56.getInstance();
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ad1;
        ab4 = fb0 && fb1;
    Thought lo3 = Thought205.getInstance(lb0, lb1, ab1, ab2);
    Output.points[6][2] += ad2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[6][3] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    Thought lo4 = Thought293.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    ab4 = fd1 > ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    Thought lo5 = Thought362.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = ab1 || ab2;
    ab3 = ad1 > ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
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
    boolean lb0 = false;
    Thought lo1 = Thought305.getInstance(fb0, fb1, lb0, fb0);
    boolean lb2 = true;
    double ld3 = 381.87954962204736;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(ld3, fd0, fd1, ld3);
}
    fb1 = fd0 > fd1;
    ld3 = fd0 - fd1;
    lb0 = !lb2;
    boolean lb4 = false;
    lb4 = !fb0;

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
    double ld0 = 331.244934112723;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    ld0 = ad1 + ad2;
    lb1 = fb0 && fb1;
    lb1 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Output.points[6][4] += ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;

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
    Thought lo0 = Thought236.getInstance(ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;

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
      ab2 = ao1.m2();
}
    ab3 = ab4 || fb0;
    ad2 = ad3 + ad4;
        boolean lb0 = true;
    double ld1 = 461.0477512809868;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    double ld2 = 585.0626017570843;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab2 = !ab3;
    ab4 = !fb0;
    fb1 = ld2 > ad1;
    boolean lb3 = true;
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1);
}
    lb0 = ld1 < ld2;
    Thought lo4 = Thought367.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, ld2, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb3);
}
    ab1 = ad1 > ad2;
    boolean lb5 = true;
    ab1 = ad3 < ad4;
    double ld6 = 714.5883605892396;
if(ao4 != null){
      ad4 = ao4.m3();
}
    fd0 = fd1 - ld1;

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
    Thought lo0 = Thought271.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    lb2 = !fb0;
    fb1 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
    lb2 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, lb2, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (lb1) {
        fd0 = fd1 - fd0;
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
    boolean lb0 = true;
    fd1 *= -1;
    Thought lo1 = Thought13.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
        boolean lb2 = true;
    double ld3 = 868.1541784588529;
    double ld4 = 402.9345651681281;
    ld3 = ld4 - fd0;
    fd1 *= -1;
    ld3 = ld4 + fd0;
        boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb6 = false;
    fd1 *= -1;
    ld3 = ld4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, ld4, fd0);
}
    fb0 = fd1 < ld3;
    fb1 = lb0 || lb2;
    ld4 = fd0 + fd1;
    Output.points[6][5] -= ld3;
    lb5 = lb6 && ab1;
    Thought lo7 = Thought47.getInstance(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld3);
    ld4 = fd0 - fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      ld3 = fo0.m3(ld4, fd0, fd1, ld3, fb0, fb1, lb0, lb2);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad2 = ad3 - ad4;
    Thought lo1 = Thought27.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    fb1 = !lb0;
    fd0 = fd1 + ad1;
    fb0 = ad2 > ad3;
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought176.getInstance(fb0, fb1, lb0, fb0);
    Thought lo3 = Thought330.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ad2 < ad3;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb4 = true;
    fd1 = ad1 + ad2;
    lb4 = !fb0;
    Thought lo5 = Thought90.getInstance(ad3, ad4, fd0, fd1, fb1, lb0, lb4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb4, fb0);
}
    fb1 = lb0 && lb4;
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return lb0;
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
    ad1 = ad2 - ad3;
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    ad4 = fd0 - fd1;
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought175.getInstance();
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = ab1 && ab2;
    fd0 = fd1 + ad1;
    if (ab3) {
        boolean lb2 = true;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m1(ad2, ad3, ad4, fd0);
}
        boolean lb3 = false;
        double ld4 = 986.3706959872552;
        fd0 = fd1 - ld4;
        ad1 = ad2 - ad3;
        Thought lo5 = Thought90.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4);
        ad1 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(ao4 != null){
      ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
        fd0 = fd1 + fd0;
        Thought lo1 = Thought47.getInstance(fo1, ao1, ao2, ao3);
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        fb0 = fd1 > fd0;
        fb1 = lb0 || fb0;
        double ld2 = 318.25308838103376;
if(ao4 != null){
          fd0 = ao4.m3(fd1, ld2, fd0, fd1);
}
        }
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    Output.points[6][6] -= fd0;

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
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[6][7] += fd1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    Thought lo1 = Thought146.getInstance(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
    ad4 *= -1;
    fd0 *= -1;
    fb0 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    double ld2 = 924.529843124006;
    fb0 = ld2 > ad1;
    double ld3 = 89.55572950934095;
    ad1 *= -1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    if (fb1) {
        lb0 = ad2 < ad3;
        ad4 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 439.29927930923566;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = ld0 > fd0;
    fb0 = !fb1;
    boolean lb2 = false;
    fd1 = ld0 + fd0;
        lb1 = fd1 > ld0;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb1 = fd1 < ld0;
    lb2 = !ab1;
    fd0 = fd1 + ld0;
    boolean lb3 = false;
    fd0 = fd1 - ld0;
    double ld4 = 817.780614462372;

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
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2();
}
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
        Thought lo0 = Thought4.getInstance(ab3, ab4, fb0, fb1);
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
        ab1 = ab2 && ab3;
        ab4 = fd0 < fd1;
        fb0 = fb1 || ab1;
if(ao3 != null){
          ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        ad4 *= -1;
        fd0 = fd1 - ad1;
        fb1 = ad2 < ad3;
        boolean lb1 = true;
        double ld2 = 861.341206701922;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
        ad3 *= -1;
        ab4 = fb0 && fb1;
        boolean lb3 = false;
        double ld4 = 712.0485266100749;
        ad3 = ad4 - fd0;
        }
    boolean lb5 = true;
    lb5 = !ab1;
    ab2 = ab3 || ab4;
    Output.points[6][8] += ad2;

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
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 460.54202954000226;
    fb1 = !fb0;
    Output.points[7][0] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[7][1] += fd0;
        boolean lb1 = false;
    fd1 = ld0 + fd0;
    Thought lo2 = Thought357.getInstance(fo1, fo0, fo1, fo0);
        fb0 = !fb1;
    Output.points[7][2] += fd1;
    ld0 *= -1;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      lb1 = fo1.m2(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = ld0 > fd0;
    lb1 = fb0 || fb1;

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
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        ab1 = fd0 > fd1;
        ab2 = !ab3;
        ab4 = fd0 > fd1;
        fb0 = fd0 < fd1;
        for(int i0=0; i0<10; i0++){
            fd0 = fd1 + fd0;
            boolean lb0 = false;
if(fo1 != null){
              fo1.m2();
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 || fb0;
    fb1 = ad4 > fd0;
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought319.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 727.5355943587867;
    ab1 = ld0 < ad1;
    Output.points[7][3] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    ad3 = ad4 - fd0;
    Thought lo2 = Thought210.getInstance(fd1, ld0, ad1, ad2);
    Thought lo3 = Thought166.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    lb1 = ld0 > ad1;
    ab1 = !ab2;
    Thought lo4 = Thought45.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    fd1 *= -1;
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb5, ab1, ab2);
}
    ab3 = ab4 || fb0;
    ld0 = ad1 - ad2;
    ad3 = ad4 - fd0;
    fd1 = ld0 - ad1;
    fb1 = !lb1;
    Thought lo6 = Thought84.getInstance();
    Thought lo7 = Thought113.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb5, ab1, ab2, ab3);
    Output.points[7][4] += fd1;
    ld0 = ad1 + ad2;
    Thought lo8 = Thought295.getInstance(ab4, fb0, fb1, lb1);

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
    boolean lb0 = true;
    Thought lo1 = Thought20.getInstance(ao2, ao3, ao4, fo0);
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    Output.points[7][5] += fd0;
    lb0 = fd1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    lb0 = fd0 < fd1;
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb2);
}
    fb0 = fd0 < fd1;
    Thought lo3 = Thought133.getInstance();
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb2, fb0);
}
    double ld4 = 939.8260432058028;

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
if(ao1 != null){
      ad1 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ad2 > ad3;
    Thought lo0 = Thought67.getInstance(ao2, ao3, ao4, fo0);
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld1 = 594.4709060953505;
    Thought lo2 = Thought218.getInstance(fd0, fd1, ld1, ad1, fb1, fb0, fb1, fb0);
    ad2 *= -1;
    fb1 = ad3 < ad4;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld3 = 401.1419181796741;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought134.getInstance();
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
        ld3 *= -1;
        boolean lb5 = true;
        for(int i1=0; i1<10; i1++){
            fb0 = ad1 > ad2;
            boolean lb6 = true;
            fb0 = fb1 && lb6;
            ad3 = ad4 - fd0;
            lb5 = fd1 > ld1;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    ab3 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
    double ld2 = 865.7002316118085;
    lb1 = ab1 || ab2;
    ab3 = fd0 < fd1;
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
    Thought lo3 = Thought220.getInstance(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
    if (ab4) {
if(ao3 != null){
          ao2 = ao3.m4(ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
        ab1 = ab2 || ab3;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
        boolean lb4 = false;
        fd0 = fd1 + ld2;
        lb0 = !lb1;
        ab1 = ab2 || ab3;
if(ao3 != null){
          ao3.m2();
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
    boolean lb0 = true;
    lb0 = ad1 > ad2;
    Output.points[7][6] += ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought124.getInstance(fb0, fb1, lb0, ab1);
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab2 = fd0 > fd1;
    double ld2 = 662.0335786777135;
    ab3 = !ab4;
    boolean lb3 = false;
    ab4 = ld2 < ad1;
    if (fb0) {
        ad2 = ad3 - ad4;
        fb1 = lb0 || lb3;
        ab1 = ab2 || ab3;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld2, ad1);
}
        if (ab4) {
            ad2 = ad3 + ad4;
if(ao4 != null){
              fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld2, ad1, ad2);
}
            Output.points[7][7] -= ad3;
            ad4 = fd0 + fd1;
            fb0 = ld2 > ad1;
            double ld4 = 894.0953758637273;
}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb0 = fb0 || fb1;
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
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought122.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
    Output.points[7][8] += fd0;
if(fo0 != null){
      fo0.m2();
}
        fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, ab1, ab2);
}
    fd1 = fd0 + fd1;
    ab3 = ab4 || fb0;
    Output.points[8][0] -= fd0;
    Thought lo2 = Thought328.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    Output.points[8][1] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb1 = false;
    boolean lb2 = false;
    fd0 = fd1 - ad1;
    ad2 *= -1;
    lb2 = ad3 < ad4;
if(fo0 != null){
      fo0.m3();
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
    Output.points[8][2] -= ad1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought273.getInstance(fb0, fb1, lb0, ab1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab2 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    Thought lo2 = Thought381.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    ab3 = ad2 < ad3;
    if (ab4) {
        ad4 = fd0 + fd1;
        ad1 *= -1;
if(fo1 != null){
          fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
        ab3 = fd1 < ad1;
        ab4 = ad2 > ad3;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
        ad4 = fd0 + fd1;
        ab2 = ad1 > ad2;
        ab3 = ad3 > ad4;
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld3 = 121.1037488545785;
        ab4 = fb0 || fb1;
        ad4 = fd0 + fd1;
        ld3 = ad1 - ad2;
        Thought lo4 = Thought391.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld5 = 597.807486585278;
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
    fd0 *= -1;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 625.1369884915148;
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          fd0 = ao3.m3();
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
    ld0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    fb0 = fd0 < fd1;

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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld0 = 246.3871658679463;
    fb0 = ad1 < ad2;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    for(int i0=0; i0<10; i0++){
        double ld2 = 668.1245795769844;
        boolean lb3 = true;
        boolean lb4 = false;
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
        boolean lb5 = true;
        boolean lb6 = true;
        fd1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, ld0, ad1, ad2);
}
        Output.points[8][3] -= ad3;
        Thought lo7 = Thought283.getInstance(ad4, fd0, fd1, ld2, lb4, lb5, lb6, lb1);
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb3, lb4, lb5);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, lb6, lb1, fb0, fb1);
}
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
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
if(ao3 != null){
      lb0 = ao3.m2(fd0, fd1, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    ab1 = !ab2;
    Thought lo1 = Thought228.getInstance(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = !lb0;
    boolean lb2 = false;
    ad4 = fd0 - fd1;
    lb2 = ab1 || ab2;
    boolean lb3 = true;
    boolean lb4 = false;
if(fo0 != null){
      fo0.m1();
}
    ab1 = ad1 < ad2;
    ab2 = ad3 < ad4;
    Output.points[8][4] += fd0;
    boolean lb5 = true;
    ab2 = !ab3;
    ab4 = fd1 < ad1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought286.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld1 = 181.74976582752407;
    fb1 = !fb0;
    Thought lo2 = Thought23.getInstance(fo0, fo1, fo0, fo1);
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo0.m3(fd1, ld1, fd0, fd1, fb0, fb1, lb3, fb0);
}
    Thought lo4 = Thought309.getInstance(fo1, fo0, fo1, fo0, fb1, lb3, fb0, fb1);
if(fo1 != null){
      ld1 = fo1.m3();
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
        boolean lb0 = true;
    lb0 = fb0 || fb1;
    boolean lb1 = false;
    lb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      lb0 = fo0.m2(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Thought lo2 = Thought221.getInstance(fd1, fd0, fd1, fd0);
    double ld3 = 112.86582022053545;
    Thought lo4 = Thought1.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
    boolean lb5 = true;
    boolean lb6 = true;
    fd1 = ld3 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, fd0, fd1, lb1, lb5, lb6, fb0);
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
    Output.points[8][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought286.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Output.points[8][6] -= fd1;
    Output.points[8][7] -= fd0;
        boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
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

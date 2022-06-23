package genetic;
import java.util.ArrayList;
class Thought15 extends Thought{
private static ArrayList<Thought15> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 497.04783325518105;
private double fd1 = 362.6927665850862;
private Thought fo0 = null;
private Thought fo1 = null;
Thought15 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought15 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought15 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought15 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought15 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 443.1241085588185;
    ld0 *= -1;
    Thought lo1 = Thought28.getInstance();
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    lb2 = fd1 < ld0;
    Thought lo3 = Thought82.getInstance(fb0, fb1, lb2, fb0);
    Output.points[4][4] += fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    Thought lo4 = Thought64.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
    fb0 = fd0 > fd1;
    fb1 = ld0 > fd0;
    lb2 = fd1 > ld0;
    fb0 = fb1 && lb2;
    fb0 = fb1 && lb2;

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
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought7.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought42.getInstance(fo0, fo1, fo0, fo1);
        if (ab3) {
if(fo0 != null){
              fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
            boolean lb2 = true;
if(fo1 != null){
              fd0 = fo1.m3();
}
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
            ab1 = !ab2;
            boolean lb3 = false;
            boolean lb4 = true;
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
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought66.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    lb1 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
    lb1 = fd0 > fd1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
        fb0 = fd0 > fd1;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
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
    ab2 = ab3 && ab4;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m1(fb0, fb1, ab1, ab2);
}
    ad4 *= -1;
    double ld0 = 495.90668019463334;
    Output.points[4][5] -= ad4;
    double ld1 = 5.9972584979234576;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = !ab4;
    fb0 = fd1 < ld0;
    Output.points[4][6] += ld1;
    Thought lo2 = Thought47.getInstance(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
    fd0 = fd1 - ld0;
    ab4 = fb0 && fb1;
    ab1 = ld1 > ad1;

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
      fd1 = ao1.m3();
}
    fb1 = !fb0;
    fd0 *= -1;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought93.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Output.points[4][7] -= fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    double ld2 = 385.03639177040975;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld2, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld2, fd0, fd1);
}
    boolean lb3 = false;
    lb3 = ld2 > fd0;
    boolean lb4 = true;
    lb4 = fb0 || fb1;
    lb0 = lb3 && lb4;
    Output.points[4][8] += fd1;
    Thought lo5 = Thought64.getInstance(fb0, fb1, lb0, lb3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought81.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fd0 *= -1;
    double ld1 = 294.6123247309987;
        fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 < ad4;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb2, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = lb2 && fb0;
        }
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo3 = Thought76.getInstance(fd0, fd1, ld1, ad1, fb1, lb2, fb0, fb1);

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
    double ld0 = 650.5675922045081;
    boolean lb1 = false;
    Thought lo2 = Thought39.getInstance();
    ld0 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      ao4 = fo0.m4(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
    double ld3 = 688.9404546999401;
    ab4 = !fb0;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
    Thought lo4 = Thought78.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
    lb1 = ld3 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld5 = 720.7790095886633;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, ld3, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ab1 = fo0.m2();
}
    ab2 = !ab3;
    boolean lb6 = true;
    ab3 = ld5 > fd0;
    Thought lo7 = Thought68.getInstance(fd1, ld0, ld3, ld5);
    fd0 *= -1;
    ab4 = fd1 < ld0;

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
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    Output.points[5][0] -= ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
        fb0 = ad2 > ad3;
    boolean lb0 = false;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
}
    ab3 = ad2 > ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    ab1 = ad4 < fd0;
    ab2 = ab3 || ab4;
    fb0 = fb1 || lb0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        fb1 = fb0 && fb1;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Output.points[5][1] -= fd1;
    fb1 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought5.getInstance(fo0, fo1, fo0, fo1);
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 685.1686821338084;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab1 = ab2 || ab3;
        ab4 = ld1 < fd0;
        fd1 = ld1 + fd0;
        fd1 = ld1 + fd0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 649.8936410738271;
    ld0 = ad1 + ad2;
    Thought lo1 = Thought96.getInstance(ad3, ad4, fd0, fd1);
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = ld0 < ad1;
        ad2 = ad3 + ad4;
if(fo0 != null){
          fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
        ad2 = ad3 + ad4;
        Thought lo2 = Thought86.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = ad2 > ad3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
        Thought lo3 = Thought75.getInstance(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo1.m1();
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
        ad3 *= -1;
        double ld4 = 646.0666193520593;
        Thought lo5 = Thought48.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
        boolean lb6 = true;
if(fo0 != null){
          ld4 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb6, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    ab2 = ad2 > ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Output.points[5][2] += ad3;
    ab1 = ad4 > fd0;
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fb0 = fb1 || lb0;
    fd1 = ad1 + ad2;
    ab1 = !ab2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    lb0 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ab3 = ad1 > ad2;
    double ld1 = 763.41688258742;
    ab4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
    fb1 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    if (fb1) {
        Output.points[5][3] += fd0;
        if (fb0) {
            double ld0 = 102.78246535830412;
            Output.points[5][4] += fd0;
            for(int i0=0; i0<10; i0++){
if(ao4 != null){
                  ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
                Output.points[5][5] += fd1;
                fb1 = ld0 > fd0;
                if (fb0) {
                    Output.points[5][6] -= fd1;
                    ld0 = fd0 - fd1;
                    ld0 *= -1;
if(fo1 != null){
                      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
                      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
                    double ld1 = 720.4865332882227;
}}}}
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
    double ld0 = 397.76074708459953;
    ld0 = ad1 + ad2;
    fb0 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    if (fb0) {
        Thought lo1 = Thought32.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
          ld0 = fo0.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
        fb0 = ld0 < ad1;
        fb1 = ad2 > ad3;
if(fo1 != null){
          fo1.m2();
}
        fb0 = fb1 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
        boolean lb2 = true;
        fb0 = ad1 > ad2;
if(ao3 != null){
          ad3 = ao3.m3(fb1, lb2, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
            if (lb2) {
}}}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought18.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Output.points[5][7] -= fd0;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb1);
}
    ab1 = ab2 || ab3;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    double ld2 = 456.23147789998774;
    ld2 = fd0 - fd1;
    ld2 = fd0 - fd1;
    fb0 = fb1 && lb1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld2 = 251.96968198845823;
    ld2 = ad1 - ad2;
    boolean lb3 = true;
    Thought lo4 = Thought62.getInstance(ao1, ao2, ao3, ao4);
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Output.points[5][8] += ld2;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    lb3 = ab1 || ab2;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab3 = !ab4;
    fd1 = ld2 - ad1;
    double ld5 = 60.13473878589909;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb1);
}
    lb3 = ab1 && ab2;
    ab3 = fd1 > ld2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld5, ad1, ad2, ad3);
}
    ab4 = !fb0;
    Thought lo6 = Thought94.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2, fb1, lb0, lb1, lb3);
if(ao2 != null){
      ld5 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo0 = Thought81.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought95.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    boolean lb2 = true;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    Thought lo4 = Thought70.getInstance(fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
    lb2 = fd0 > fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3();
}
    if (ab2) {
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1);
}
        double ld0 = 967.7977547945408;
        } else if (ab3) {
        double ld1 = 466.2042389727389;
        ab4 = fb0 && fb1;
if(fo0 != null){
          ld1 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ld1 = fd0 + fd1;
        Thought lo2 = Thought94.getInstance(fo0, fo1, fo0, fo1);
        Output.points[6][0] -= ld1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        ld1 = fd0 + fd1;
        fb0 = ld1 > fd0;
        fd1 *= -1;
        boolean lb3 = true;
        fb0 = !fb1;
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought36.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fb1 && fb0;
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb1, fb0);
}
    ad1 = ad2 - ad3;
    Output.points[6][1] += ad4;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb2, lb3, fb0, fb1);
}
    ad3 = ad4 - fd0;
    Output.points[6][2] += fd1;
    Output.points[6][3] -= ad1;
    lb1 = lb2 && lb3;
    fb0 = fb1 && lb1;
    boolean lb4 = false;
    ad2 = ad3 + ad4;
    Output.points[6][4] += fd0;
    lb2 = !lb3;
    lb4 = fb0 || fb1;
    boolean lb5 = false;
    lb1 = lb2 || lb3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, lb5, fb0, fb1);
}
    lb1 = lb2 && lb3;
    Output.points[6][5] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld6 = 172.71918048296695;

Thought.STACK_COUNTER++;
return ld6;
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
    double ld0 = 132.7929526065904;
    ab2 = ab3 && ab4;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    Thought lo1 = Thought55.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    ld0 *= -1;
    Output.points[6][6] -= ad1;
    fb1 = ab1 && ab2;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 > ad3;
    ad4 *= -1;
        lb2 = ab1 && ab2;
    ab3 = fd0 > fd1;
    ld0 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fb0 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
            double ld0 = 773.7218536540206;
if(ao3 != null){
      fb1 = ao3.m2();
}
    Thought lo1 = Thought97.getInstance(ld0, fd0, fd1, ld0);
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;

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
    Output.points[6][7] += ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1);
}
    double ld0 = 39.10757733953427;

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
    double ld0 = 312.7391363690667;
    Output.points[6][8] += ld0;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    fd0 = fd1 + ld0;
    ab1 = fd0 < fd1;
    if (ab2) {
        ab3 = ab4 || fb0;
if(ao3 != null){
          ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        Output.points[7][0] -= ld0;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
          fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    double ld0 = 876.0603672151362;
    boolean lb1 = false;
    Output.points[7][1] += ld0;

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
    Thought lo0 = Thought96.getInstance();
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought85.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    if (fb0) {
        fd0 *= -1;
        Output.points[7][2] -= fd1;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3();
}
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0);
}
        fb1 = !fb0;
        Thought lo2 = Thought81.getInstance(fb1, fb0, fb1, fb0);
        fb1 = fd1 < fd0;
        Thought lo3 = Thought18.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        Output.points[7][3] += fd1;
        Thought lo4 = Thought33.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
        boolean lb5 = true;
        fd0 *= -1;
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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2();
}
    fd0 = fd1 + fd0;
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;

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
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 && fb1;
if(fo1 != null){
      ad3 = fo1.m3();
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(lb0, lb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        Thought lo2 = Thought71.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
        fd0 = fd1 - ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
        Thought lo3 = Thought50.getInstance(fo0, fo1, fo0, fo1);
        lb0 = lb1 || fb0;
        Thought lo4 = Thought41.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
        boolean lb5 = false;
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
    ad2 = ad3 + ad4;
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = !ab4;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    double ld1 = 785.5857260894762;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
    lb2 = ad2 < ad3;
    boolean lb3 = true;
    Output.points[7][4] -= ad4;
    lb3 = !ab1;
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
    ld1 = ad1 - ad2;
    Thought lo4 = Thought41.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, lb2, lb3);
    ab1 = ld1 > ad1;
    ab2 = ad2 < ad3;
    ab3 = ad4 > fd0;
    boolean lb5 = true;
    ab3 = fd1 > ld1;
    ab4 = ad1 < ad2;
    boolean lb6 = true;
    ab4 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
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
    fb0 = !fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 405.1025215010871;
    boolean lb1 = true;
    ld0 *= -1;
    lb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ld0 = fd0 - fd1;
    fb0 = fb1 && lb1;

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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    Output.points[7][5] -= fd0;
    fb0 = fd1 < ad1;
    boolean lb1 = true;
    fb0 = !fb1;
    ad2 *= -1;
if(ao3 != null){
      lb0 = ao3.m2(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    lb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
    Thought lo2 = Thought87.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, lb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m1();
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought0.getInstance(fb0, fb1, lb0, ab1);
    boolean lb2 = true;
    ab1 = fd0 < fd1;
    fd0 *= -1;
    ab2 = fd1 < fd0;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab4 = fd1 < fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ab2 = ab3 || ab4;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ad3 = ad4 + fd0;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        Thought lo1 = Thought34.getInstance(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
        double ld2 = 945.263668179259;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo3 = Thought75.getInstance(ld2, ad1, ad2, ad3);
        ab4 = fb0 && fb1;
        }
    lb0 = fd0 > fd1;
    ad1 *= -1;
if(ao1 != null){
      ad2 = ao1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ab4 = ad2 < ad3;

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
    Output.points[7][6] += fd1;
    double ld0 = 587.1247927597137;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 && fb1;
    fd1 = ld0 + fd0;
    boolean lb3 = true;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m1(lb1, lb2, lb3, fb0);
}
    fb1 = !lb1;
    Thought lo4 = Thought34.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);

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
    fd0 = fd1 - fd0;
        boolean lb0 = true;
    double ld1 = 542.670353513662;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought1.getInstance(fo1, fo0, fo1, fo0);
    Output.points[7][7] -= fd1;
    lb0 = ld1 > fd0;
    fd1 = ld1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    Output.points[7][8] -= fd0;
    double ld0 = 929.1172533109971;
    fd0 *= -1;
    fd1 = ld0 + fd0;

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

package genetic;
import java.util.ArrayList;
class Thought45 extends Thought{
private static ArrayList<Thought45> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 821.3341128947056;
private double fd1 = 117.56847675975291;
private Thought fo0 = null;
private Thought fo1 = null;
Thought45 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought45 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought45 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought45 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought45 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought45 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought45 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought45 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought45 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought45 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought45 instance = new Thought45 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought48.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought247.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo3 = Thought55.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb2, fb0, fb1);
    lb2 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld4 = 880.2627187167883;
    fb1 = !lb2;
    fb0 = !fb1;

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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    fb0 = fd1 > fd0;
    boolean lb1 = true;
    boolean lb2 = true;
    ab4 = fd1 < fd0;

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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    fb1 = !lb0;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought107.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
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
    double ld0 = 742.8856605891983;
    ab1 = ad1 < ad2;
    Thought lo1 = Thought210.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
        if (fb1) {
        ld0 *= -1;
        double ld2 = 474.0977834962044;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = fb1 || ab1;
        ab2 = ld0 < ad1;
        ad2 = ad3 + ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld0, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
        ab4 = ad1 > ad2;
        fb0 = !fb1;
        ab1 = ab2 && ab3;
        Output.points[0][3] -= ad3;
        double ld3 = 67.12529439617651;
if(fo1 != null){
          fo1.m3(ab4, fb0, fb1, ab1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought332.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    Output.points[0][4] += fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    Output.points[0][5] -= fd1;
    fd0 = fd1 + fd0;
    if (fb0) {
        fb1 = !lb1;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
        lb1 = fd1 < fd0;
        fb0 = !fb1;
        double ld2 = 753.9113543347205;
if(ao1 != null){
          fo1 = ao1.m4();
}
        fd0 *= -1;
        fd1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
}
        fb0 = fd0 < fd1;
if(ao2 != null){
          ld2 = ao2.m3(fb1, lb1, fb0, fb1);
}
        double ld3 = 544.0852800668004;
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
    fb0 = ad2 < ad3;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    ad4 = fd0 - fd1;
    double ld1 = 783.3948772804915;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    for(int i0=0; i0<10; i0++){
        lb0 = ld1 < ad1;
        ad2 = ad3 + ad4;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld1, ad1);
}
        }
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
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
    double ld0 = 186.56462595375177;
    boolean lb1 = false;
    ld0 = fd0 - fd1;
if(ao2 != null){
      ab1 = ao2.m2(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    double ld2 = 90.43370594952492;
    boolean lb3 = false;
    fb0 = ld2 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, lb3, ab1);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    double ld4 = 582.7857697863482;
    ld0 *= -1;
    double ld5 = 46.94534858585119;

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
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        fb1 = ad3 > ad4;
        ab1 = !ab2;
        Thought lo0 = Thought342.getInstance(ab3, ab4, fb0, fb1);
        fd0 = fd1 + ad1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        boolean lb1 = false;
        lb1 = ab1 && ab2;
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
        ad1 = ad2 - ad3;
        ab3 = ab4 || fb0;
        ad4 *= -1;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
          fb1 = ao3.m2(ad4, fd0, fd1, ad1, lb1, ab1, ab2, ab3);
}
        }
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao4.m1();
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
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
        boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought29.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        boolean lb2 = false;
        double ld3 = 68.54797282581141;
if(fo1 != null){
          fo1.m1(ld3, fd0, fd1, ld3, lb0, fb0, fb1, lb2);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb2);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        Thought lo4 = Thought338.getInstance(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, lb0, fb0, fb1, lb2);
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb2);
}
        boolean lb5 = true;
        lb5 = lb0 && fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld3, fd0, fd1);
}
        boolean lb6 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3);
}
        Output.points[0][6] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld3, fd0, fd1, lb2, lb5, lb6, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb5);
}
        lb6 = !lb0;
if(fo1 != null){
          fo0 = fo1.m4();
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    fd0 *= -1;
    ab2 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = ab4 && fb0;
    fd1 = fd0 - fd1;

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
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    if (fb0) {
        fb1 = fb0 && fb1;
if(fo0 != null){
          fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought126.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fd0 = fo1.m3();
}
        fd1 = ad1 - ad2;
        if (fb0) {
            Output.points[0][7] += ad3;
            ad4 = fd0 - fd1;
            fb1 = fb0 && fb1;
if(fo0 != null){
              ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
            fd1 = ad1 - ad2;
if(fo0 != null){
              fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1);
}
            ad3 = ad4 + fd0;
if(fo1 != null){
              fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
              fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
            Thought lo1 = Thought271.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}}
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    ab1 = ad2 > ad3;
    ad4 *= -1;
    ab2 = ab3 || ab4;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    ad4 *= -1;
    if (lb1) {
        Thought lo2 = Thought339.getInstance(ab1, ab2, ab3, ab4);
        fb0 = !fb1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        lb0 = fd1 > ad1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        double ld3 = 617.0998654467965;
        Thought lo4 = Thought356.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ad1);
        lb1 = ab1 && ab2;
if(fo1 != null){
          fo1.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab3 = fd1 > ld3;
        ad1 *= -1;
        ab4 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, lb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        boolean lb5 = true;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb5, lb0);
}
        fd1 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    double ld0 = 45.4575930946643;
    ld0 *= -1;
    Output.points[0][8] += fd0;
    fb1 = fd1 < ld0;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    Thought lo3 = Thought195.getInstance(ao4, fo0, fo1, ao1, lb1, lb2, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb4 = false;

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
    fb1 = ad1 > ad2;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    Output.points[1][0] += ad2;
if(ao1 != null){
      ad3 = ao1.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 63.54839002629206;
    fb1 = ad3 < ad4;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2);
}
    Output.points[1][1] -= ad3;
    ad4 = fd0 - fd1;
    boolean lb2 = false;
    Thought lo3 = Thought252.getInstance(ld0, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
        ad4 *= -1;
    lb1 = fd0 > fd1;
    lb2 = fb0 || fb1;

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
    boolean lb0 = false;
    ab1 = fd0 < fd1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    Output.points[1][2] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo1 = Thought309.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - fd0;

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
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought128.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
    Thought lo1 = Thought159.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
    Thought lo2 = Thought163.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo0.m2();
}
    boolean lb3 = true;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
    Thought lo4 = Thought49.getInstance(lb3, ab1, ab2, ab3);
    Thought lo5 = Thought353.getInstance(fo0, fo1, ao1, ao2);
    Thought lo6 = Thought155.getInstance(fd0, fd1, ad1, ad2);
    boolean lb7 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;

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
    fb0 = !fb1;
    double ld1 = 528.2649120446711;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      lb0 = fo1.m2();
}
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
    double ld2 = 203.9151871910393;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ld1 = fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = ld2 < fd0;
    Thought lo3 = Thought368.getInstance(fo1, fo0, fo1, fo0);
    boolean lb4 = false;
    boolean lb5 = false;
    lb4 = fd1 < ld1;
    ld2 = fd0 - fd1;
    lb5 = !fb0;
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, fd0, fd1, fb0, fb1, lb0, lb4);
}
    if (lb5) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb6, fb0, fb1, lb0);
}
        boolean lb7 = true;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    Output.points[1][3] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    Thought lo1 = Thought140.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    ab1 = !ab2;
    Output.points[1][4] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb0 = !ab1;
    boolean lb2 = false;
    ab1 = fd1 < fd0;
    ab2 = ab3 && ab4;
    for(int i0=0; i0<10; i0++){
        double ld3 = 486.76366900843476;
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
    ad1 *= -1;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        fd1 *= -1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = ad1 > ad2;
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = ad3 < ad4;
        fb1 = fb0 && fb1;
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
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    fd1 = ad1 + ad2;
    ab1 = !ab2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    ad2 = ad3 + ad4;
    double ld0 = 524.9459590711689;
    ab2 = ab3 && ab4;
    double ld1 = 314.24869590086644;

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
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought245.getInstance();
    Output.points[1][5] -= fd0;
    fb1 = !fb0;
    boolean lb1 = false;
    double ld2 = 278.5859502441465;
    Thought lo3 = Thought73.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0, fb0, fb1, lb1, fb0);
if(ao4 != null){
      ao4.m3(fb1, lb1, fb0, fb1);
}
    lb1 = fd1 < ld2;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    if (fb1) {
        Thought lo4 = Thought169.getInstance(ld2, fd0, fd1, ld2);
        Thought lo5 = Thought83.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0);
if(ao3 != null){
          ao3.m3(fd1, ld2, fd0, fd1, lb1, fb0, fb1, lb1);
}
        ld2 = fd0 - fd1;
        fb0 = fb1 || lb1;
        fb0 = ld2 < fd0;
        Thought lo6 = Thought250.getInstance(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
        fd1 = ld2 - fd0;
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
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 = ad3 + ad4;
    Output.points[1][6] += fd0;
    boolean lb0 = true;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = ad4 > fd0;
    Thought lo1 = Thought224.getInstance(lb0, fb0, fb1, lb0);
    double ld2 = 988.7407502173633;
    double ld3 = 722.703631556619;
    Thought lo4 = Thought54.getInstance(ao3, ao4, fo0, fo1);
    double ld5 = 270.43537630889057;
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;
    boolean lb6 = true;
    boolean lb7 = true;
if(ao2 != null){
      ao1 = ao2.m4(ld2, ld3, ld5, ad1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      lb0 = ao2.m2(fd1, ld2, ld3, ld5, lb6, lb7, fb0, fb1);
}
    lb0 = lb6 || lb7;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb6);
}
    double ld8 = 579.7569374494599;

Thought.STACK_COUNTER++;
return ld8;
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
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    ab3 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
        ab4 = fb0 || fb1;
    lb0 = ab1 && ab2;
    Output.points[1][7] -= fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    ab2 = !ab3;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld2 = 1000.4637742029024;
if(ao4 != null){
      ao4.m1(fd0, fd1, ld2, fd0);
}
    Thought lo3 = Thought364.getInstance(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
    ab1 = !ab2;
    double ld4 = 638.3873378384927;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought237.getInstance(ad2, ad3, ad4, fd0, lb0, lb1, ab1, ab2);
    boolean lb3 = false;
    ab2 = fd1 < ad1;
    ad2 = ad3 - ad4;
    Thought lo4 = Thought298.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fd0 < fd1;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb3, lb5, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        boolean lb6 = true;
        ab2 = ab3 && ab4;
        for(int i1=0; i1<10; i1++){
            Thought lo7 = Thought353.getInstance(fb0, fb1, lb6, lb0);
            lb1 = fd0 < fd1;
            double ld8 = 912.9478929723344;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
              ld8 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld8, ad1);
}
            for(int i2=0; i2<10; i2++){
if(ao1 != null){
                  lb3 = ao1.m2(ad2, ad3, ad4, fd0, lb5, ab1, ab2, ab3);
}
                boolean lb9 = true;
                ab3 = ab4 || fb0;
                Thought lo10 = Thought259.getInstance(ao2, ao3, ao4, fo0, fb1, lb9, lb6, lb0);
                Output.points[1][8] += fd1;
                ld8 = ad1 + ad2;
                lb1 = ad3 > ad4;
}}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought201.getInstance();
    fb0 = fb1 && fb0;
    Output.points[2][0] += fd1;
    fd0 = fd1 + fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought96.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought161.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[2][1] += fd0;
    Thought lo3 = Thought125.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);

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
    fd1 = fd0 - fd1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought93.getInstance();
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || ab1;
    fd1 *= -1;
    ab2 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    double ld1 = 468.80677447161423;
    fd0 = fd1 + ld1;
    ab3 = fd0 < fd1;
    Thought lo2 = Thought239.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, ld1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1();
}
    ld1 = fd0 - fd1;
    ld1 = fd0 - fd1;
    ab1 = ab2 || ab3;

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
    Output.points[2][2] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd1 *= -1;
    fb0 = fb1 || lb0;
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 - fd0;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    Thought lo1 = Thought339.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    ad4 = fd0 + fd1;
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fb0 = fo0.m2();
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
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && ab1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    double ld1 = 503.3042713669064;
    ab2 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ab3 = ab4 || fb0;
    fb1 = !lb0;
    double ld2 = 465.19236938175936;
    ab1 = ab2 || ab3;
    boolean lb3 = false;
    ld1 *= -1;

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
    Thought lo0 = Thought338.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    double ld2 = 163.1341531312579;
if(ao1 != null){
      ao1.m2(fb0, fb1, lb1, fb0);
}
    double ld3 = 164.32257530103226;
    ld2 = ld3 + fd0;
    fb1 = lb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo4 = Thought320.getInstance(fd1, ld2, ld3, fd0);
    Output.points[2][3] += fd1;
    ld2 = ld3 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, ld3, fd0);
}
        fd1 = ld2 + ld3;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld2, ld3, fb1, lb1, fb0, fb1);
}
    double ld5 = 76.38660524798469;
if(ao4 != null){
      ld5 = ao4.m3(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 + ld2;
    fb0 = !fb1;
    lb1 = fb0 || fb1;
    lb1 = !fb0;
if(ao3 != null){
      ao3.m3();
}
    double ld6 = 234.96651211240362;
    ld3 = ld5 - ld6;
    double ld7 = 337.04132510300576;

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
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 *= -1;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    boolean lb1 = true;
if(ao1 != null){
      ad2 = ao1.m3(lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought359.getInstance(ao2, ao3, ao4, fo0);
    ad3 = ad4 + fd0;
        Thought lo3 = Thought347.getInstance(fd1, ad1, ad2, ad3);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = ad1 > ad2;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = lb0 && lb1;

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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    double ld1 = 182.74312300228726;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, fd0, fd1);
}
    lb0 = !ab1;
    Output.points[2][4] -= ld1;
    Output.points[2][5] -= fd0;
    fd1 = ld1 + fd0;
    ab2 = !ab3;
    boolean lb2 = true;
    fd1 = ld1 + fd0;
    double ld3 = 900.1218983045344;
    ab3 = !ab4;
    double ld4 = 73.10058237552737;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld4, fd0, fd1, ld1);
}
    ld3 *= -1;
    fb0 = ld4 < fd0;
    fb1 = !lb0;

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
    ab2 = ab3 || ab4;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = fd1 > ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad3 *= -1;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought52.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
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
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
    Output.points[2][6] += fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 972.0926828112295;
    Output.points[2][7] -= ld1;
        boolean lb2 = true;
    lb0 = lb2 || fb0;
    fd0 = fd1 + ld1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
        fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought130.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    Output.points[2][8] += fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
    Output.points[3][0] += fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    Output.points[3][1] -= fd0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    lb1 = fd1 > fd0;
    fb0 = !fb1;
    lb0 = fd1 > fd0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld2 = 770.0220470155273;
    fd0 = fd1 + ld2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
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

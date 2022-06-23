package genetic;
import java.util.ArrayList;
class Thought26 extends Thought{
private static ArrayList<Thought26> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 160.20094116519826;
private double fd1 = 781.3430663208185;
private Thought fo0 = null;
private Thought fo1 = null;
Thought26 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought26 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought26 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought26 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought26 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought26 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought26 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought26 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought26 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought26 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought26 instance = new Thought26 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought52.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    lb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought72.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    double ld3 = 447.4180811419384;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
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
    ab2 = fd1 < fd0;
    boolean lb0 = true;
    ab2 = ab3 && ab4;
    boolean lb1 = true;
    fd1 *= -1;
    ab4 = fb0 || fb1;
    lb0 = lb1 || ab1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb0;
    boolean lb2 = true;
    Output.points[6][0] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    lb1 = !lb2;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
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
    fb1 = ad2 < ad3;
    double ld0 = 722.7820995832766;
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
    if (fb0) {
if(fo0 != null){
          ld0 = fo0.m3();
}
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        ad4 = fd0 - fd1;
        boolean lb1 = true;
        fb0 = fb1 || lb1;
        fb0 = ld0 < ad1;
        fb1 = !lb1;
        fb0 = ad2 < ad3;
        } else {
        ad4 = fd0 + fd1;
        ld0 *= -1;
        fb0 = ad1 < ad2;
        boolean lb2 = true;
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
        double ld3 = 400.0627021666042;
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
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    Thought lo0 = Thought66.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
if(fo0 != null){
      ad2 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    ab2 = ab3 && ab4;
    fb0 = ad3 > ad4;
    double ld1 = 286.3897673742883;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
    fb0 = ad4 < fd0;
    Output.points[6][1] += fd1;
    fb1 = lb2 && ab1;
if(fo1 != null){
      fo1.m3(ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Output.points[6][2] += ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb2, ab1, ab2);
}
    fd0 *= -1;
    fd1 = ld1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(ao4 != null){
      ao4.m3();
}
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fb0 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        boolean lb1 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb0);
}
        fb0 = fb1 || lb1;
        lb0 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb0);
}
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          fd1 = ao2.m3(fb0, fb1, lb1, lb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought87.getInstance();
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;
    fb0 = ad4 < fd0;
    boolean lb1 = false;
    Output.points[6][3] += fd1;
    double ld2 = 786.27476029289;
    fb0 = ld2 > ad1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m3(ab3, ab4, fb0, fb1);
}
    Output.points[6][4] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 821.4119883566079;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
        double ld1 = 958.0582683415385;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ld1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ld1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
        ab3 = ld0 < fd0;
        Output.points[6][5] += fd1;
if(fo0 != null){
          ao4 = fo0.m4(ld1, ld0, fd0, fd1);
}
if(fo1 != null){
          ld1 = fo1.m3(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld1);
}
        ld0 *= -1;
        Thought lo2 = Thought37.getInstance(ab4, fb0, fb1, ab1);
        ab2 = ab3 || ab4;
        fd0 *= -1;
        Output.points[6][6] += fd1;
        fb0 = fb1 || ab1;
        double ld3 = 30.000575233427767;
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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad4 = fd0 - fd1;
    Thought lo0 = Thought34.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    lb1 = ab1 || ab2;
    double ld2 = 60.42137932413268;
    ld2 *= -1;
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, lb3, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ld2, ad1, ad2, ad3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2);
}
    Thought lo4 = Thought93.getInstance(ab3, ab4, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb1, lb3, ab1, ab2);
}
    fd0 = fd1 + ld2;
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = true;
    if (lb0) {
        fd1 = fd0 + fd1;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        lb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, lb0, fb0);
}
        fb1 = lb1 || lb0;
        boolean lb2 = true;
        double ld3 = 95.93093347055648;
        lb0 = fb0 || fb1;
if(fo1 != null){
          fo1.m1(fd0, fd1, ld3, fd0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
        lb1 = lb2 || lb0;
        for(int i0=0; i0<10; i0++){
            if (fb0) {
}}}
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
    ab1 = ab2 || ab3;
    double ld0 = 957.2219815742212;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
        if (ab2) {
        ld0 = fd0 + fd1;
        Thought lo1 = Thought82.getInstance();
if(fo1 != null){
          fo1.m2(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
        double ld2 = 943.9007895424443;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        ab1 = ab2 && ab3;
        double ld3 = 449.2036260345438;
        Thought lo4 = Thought87.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld2, ab4, fb0, fb1, ab1);
        Output.points[6][7] += ld3;
        boolean lb5 = true;
        ab1 = ab2 || ab3;
        ab4 = ld0 < fd0;
        fb0 = fd1 > ld2;
        } else {
        fd0 = fd1 + ld0;
        boolean lb6 = true;
        lb6 = ab1 || ab2;
        fd0 = fd1 - ld0;
        fd0 = fd1 - ld0;
        ab3 = ab4 && fb0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb1, lb6, ab1, ab2);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought21.getInstance();
        fb0 = ad4 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
        fb0 = !fb1;
        lb1 = ad4 > fd0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb2 = false;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
        Thought lo3 = Thought18.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        ad2 *= -1;
        ad3 = ad4 - fd0;
        boolean lb4 = false;
        lb4 = fb0 && fb1;
        lb1 = lb2 && lb4;
if(fo0 != null){
          fo0.m2(fb0, fb1, lb1, lb2);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        lb4 = fb0 && fb1;
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
    Thought lo0 = Thought7.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
    ad1 = ad2 - ad3;
    ab1 = ab2 || ab3;
    ad4 = fd0 + fd1;
    ab4 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought35.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;

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
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = !fb0;
    Output.points[6][8] -= fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao4 != null){
      ao4.m3();
}
    Thought lo1 = Thought28.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    Thought lo0 = Thought70.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    ad3 *= -1;
    Thought lo1 = Thought2.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    boolean lb2 = false;
    Output.points[7][0] += ad4;
    Output.points[7][1] += fd0;
    boolean lb3 = true;
    double ld4 = 737.2307375841841;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld4, ad1);
}
    lb3 = !fb0;

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
    boolean lb0 = true;
        fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m2(lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought44.getInstance();
    fd1 *= -1;
    boolean lb2 = false;
    if (ab3) {
        double ld3 = 106.58446887734227;
        boolean lb4 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    lb0 = !ab1;
if(ao1 != null){
      ab2 = ao1.m2(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 + ad4;
    Thought lo1 = Thought19.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(ao4 != null){
      fb1 = ao4.m2();
}
    Thought lo2 = Thought11.getInstance(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought18.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 > fd0;
        fb0 = fb1 || fb0;
        fb1 = fb0 || fb1;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        ab2 = ab3 || ab4;
        fb0 = fb1 || lb0;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = !fb1;
        lb0 = ab1 && ab2;
        double ld1 = 605.9850194128574;
        double ld2 = 452.5481537698141;
        ld2 = fd0 - fd1;
        ld1 = ld2 - fd0;
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
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 - ad3;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought48.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    Thought lo2 = Thought31.getInstance(lb0, fb0, fb1, lb0);
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    lb0 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    fd1 *= -1;
        ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;

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
    ad2 = ad3 - ad4;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    ad3 *= -1;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1);
}
    boolean lb1 = false;
    ab1 = ad2 < ad3;
    boolean lb2 = false;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    boolean lb3 = false;
    Thought lo4 = Thought32.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    Thought lo5 = Thought98.getInstance(lb0, lb1, lb2, lb3);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld6 = 496.4574805977356;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb1 = lb2 && lb3;
    Thought lo7 = Thought81.getInstance(fo1, fo0, fo1, fo0, ld6, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    double ld8 = 500.2143399485551;
    boolean lb9 = false;
    if (ab4) {
        } else if (fb0) {
        Output.points[7][2] += ad3;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1();
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    lb0 = fb0 || fb1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb1 = false;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought7.getInstance(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb0);
    double ld3 = 679.2487277189118;
    fd0 *= -1;

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
        boolean lb0 = false;
    fb0 = ad1 < ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fb1 = ao3.m2(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought43.getInstance();
    fb0 = fd1 < ad1;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = fd1 < ad1;
    ad2 *= -1;
    lb0 = !fb0;
    Output.points[7][3] += ad3;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    Thought lo2 = Thought75.getInstance(ad2, ad3, ad4, fd0);
    Thought lo3 = Thought16.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
    boolean lb4 = false;
if(ao4 != null){
      ao3 = ao4.m4(lb4, fb0, fb1, lb0);
}
    boolean lb5 = false;
    Thought lo6 = Thought18.getInstance();
    ad1 *= -1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, lb4, lb5, fb0, fb1);
}
    lb0 = fd1 > ad1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[7][4] -= fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought89.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = true;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
    Thought lo3 = Thought3.getInstance(ab4, fb0, fb1, lb0);
    fd0 *= -1;
    lb2 = fd1 > fd0;

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
      ad1 = ao2.m3();
}
    ad2 *= -1;
if(ao3 != null){
      ab1 = ao3.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
    double ld0 = 587.3451465255428;
    ab1 = fd0 < fd1;
    Thought lo1 = Thought86.getInstance(ao4, fo0, fo1, ao1);
    ld0 *= -1;
    ad1 *= -1;
    ab2 = !ab3;
    ab4 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
    ad3 = ad4 + fd0;
    ab4 = fd1 > ld0;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m1(ab4, fb0, fb1, lb2);
}
    if (ab1) {
        Thought lo3 = Thought12.getInstance();
        boolean lb4 = true;
        ab1 = !ab2;
        boolean lb5 = true;
        Thought lo6 = Thought46.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
        boolean lb7 = false;
        Thought lo8 = Thought10.getInstance(ao3, ao4, fo0, fo1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 18.535829829327692;
    boolean lb1 = false;
    Thought lo2 = Thought42.getInstance(fd0, fd1, ld0, fd0);
    fd1 = ld0 - fd0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb0 = ld0 < fd0;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo0.m3(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    lb1 = fb0 || fb1;

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
    Thought lo0 = Thought49.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fb1 = !ab1;
    double ld1 = 546.8661851945111;
    ab2 = ld1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ld1 < fd0;
    ab2 = ab3 && ab4;
    double ld2 = 402.7362161999053;
    Thought lo3 = Thought66.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ld2, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < ld1;
    ab4 = ld2 < fd0;

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
    ad2 = ad3 + ad4;
    fb0 = fb1 && fb0;
    fd0 = fd1 + ad1;
    fb1 = ad2 > ad3;
    double ld0 = 405.4545463600418;
    fb0 = !fb1;
    ad3 = ad4 + fd0;
    Thought lo1 = Thought72.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    Thought lo3 = Thought46.getInstance(fd0, fd1, ld0, ad1);
    boolean lb4 = false;
    double ld5 = 966.1622201537883;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    lb4 = fd1 > ld0;
    boolean lb6 = false;
    lb6 = ld5 > ad1;
    if (fb0) {
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo1.m1(fb1, lb2, lb4, lb6);
}
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
    ab2 = ad2 > ad3;
    ab3 = ab4 || fb0;
    boolean lb0 = true;
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    ab2 = ad3 < ad4;
    ab3 = fd0 < fd1;
    ad1 *= -1;
    Thought lo1 = Thought46.getInstance(fo0, fo1, fo0, fo1);
    ad2 *= -1;
    boolean lb2 = false;
    ab3 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb0 = true;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
    double ld2 = 436.4561063575867;
    fb0 = ld2 < fd0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    ld2 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1, lb0, lb1, fb0, fb1);
}
    ld2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
}
    lb0 = fd0 < fd1;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(ld2, fd0, fd1, ld2);
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
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Thought lo0 = Thought65.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fb0 = !fb1;
    Thought lo1 = Thought99.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fd0 > fd1;
        Thought lo2 = Thought31.getInstance();
    fb1 = ad1 > ad2;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[7][5] -= fd1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
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
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
    Thought lo0 = Thought63.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld1 = 984.1120857761462;
    fb1 = ab1 && ab2;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
        fb1 = fd1 > ld1;
        }
    double ld2 = 642.5812682137869;

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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ab1 = !ab2;
    ad1 *= -1;
    ab3 = ab4 || fb0;
    fb1 = ad2 < ad3;
    Thought lo0 = Thought24.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
    ad2 *= -1;
if(ao1 != null){
      ao1.m3(ab1, ab2, ab3, ab4);
}
        double ld1 = 348.90558437604835;
    boolean lb2 = false;
if(ao2 != null){
      ad2 = ao2.m3();
}
    ad3 *= -1;

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
    fd0 = fd1 - fd0;
    Thought lo0 = Thought37.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    Thought lo2 = Thought85.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + fd0;
    Output.points[7][6] += fd1;
    fb0 = !fb1;
    lb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    lb1 = fd1 > fd0;
    fb0 = fb1 || lb1;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    Thought lo3 = Thought37.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
    double ld4 = 303.16377831176317;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ld4, fd0, fd1, ld4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1);
}
    fb1 = lb1 && fb0;
if(fo1 != null){
      fo1.m3(fb1, lb1, fb0, fb1);
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
    fd0 *= -1;
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    double ld1 = 615.6001470777825;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = !lb0;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb2 = fb0 && fb1;
    lb0 = lb2 && fb0;

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
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought79.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought38.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought17.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;
    fb0 = fb1 && lb3;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo5 = Thought75.getInstance(lb4, fb0, fb1, lb3);
    lb4 = fd0 > fd1;
    fb0 = fb1 || lb3;
    Thought lo6 = Thought61.getInstance();
    Thought lo7 = Thought64.getInstance(fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb3);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
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
}
